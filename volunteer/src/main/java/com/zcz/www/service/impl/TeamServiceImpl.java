package com.zcz.www.service.impl;

import com.zcz.www.dao.TeamMapper;
import com.zcz.www.dao.TeamMemberMapper;
import com.zcz.www.dao.VolunteerMapper;
import com.zcz.www.entity.*;
import com.zcz.www.pojo.AllTeamInfo;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.TeamAndLeaderInfo;
import com.zcz.www.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ZY on 2018/3/13.
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamExample teamExample;
    @Autowired
    TeamMapper teamMapper;
    @Autowired
    TeamMemberExample teamMemberExample;
    @Autowired
    TeamMemberMapper teamMemberMapper;
    @Autowired
    VolunteerExample volunteerExample;
    @Autowired
    VolunteerMapper volunteerMapper;

    Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);

    @Override
    public BaseResult selectAllTeam() {
        teamExample = new TeamExample();
        teamExample.createCriteria().andIdIsNotNull();
        List<Team> teams = teamMapper.selectByExample(teamExample);
        List<TeamAndLeaderInfo> teamAndLeaderInfos = new ArrayList<TeamAndLeaderInfo>();
        for(Team team: teams){
            TeamAndLeaderInfo teamAndLeaderInfo = new TeamAndLeaderInfo();
            Integer leaderId = team.getLeaderId();
            Volunteer teamLeader = volunteerMapper.selectByPrimaryKey(leaderId);
            teamLeader.setVolunteerPwd("*******");
            teamAndLeaderInfo.setTeam(team);
            teamAndLeaderInfo.setVolunteer(teamLeader);
            teamAndLeaderInfos.add(teamAndLeaderInfo);
        }
        logger.info("选择所有团队信息成功！");
        return BaseResult.create(200, teamAndLeaderInfos, "获取数据成功");
    }

    @Override
    public BaseResult selectTeamAndMemberByTeamId(int teamId) {
        teamMemberExample = new TeamMemberExample();
        teamMemberExample.createCriteria().andIdEqualTo(teamId).andStatusEqualTo(1);
        List<TeamMember> teamMembers = teamMemberMapper.selectByExample(teamMemberExample);
        List<Integer> teamMemberIds = new ArrayList<>();
        for (TeamMember teamMember : teamMembers) {
            teamMemberIds.add(teamMember.getUserId());
        }
        volunteerExample = new VolunteerExample();
        volunteerExample.createCriteria().andIdIn(teamMemberIds);
        List<Volunteer> volunteers = volunteerMapper.selectByExample(volunteerExample);
        logger.info("获取团队所有成员信息成功！");
        return BaseResult.create(200, volunteers, "获取信息成功");
    }

    @Override
    public BaseResult selectTeamByLeaderId(int teamLeaderId) {
        teamExample = new TeamExample();
        teamExample.createCriteria().andLeaderIdEqualTo(teamLeaderId);
        if(teamMapper.selectByExample(teamExample).size() == 0){
            Team team = new Team();
            return BaseResult.create(200,team,"尚未加入团队");
        }
        Team team = teamMapper.selectByExample(teamExample).get(0);
        return BaseResult.create(200,team,"获取成功");
    }

    @Override
    public BaseResult addTeam(Team team) {
        if (null != team.getId()) {
            logger.info("添加团队信息失败！团队ID非法");
            return BaseResult.createBadRequest();
        }
        team.setTeamStauts(0);
        team.setModifyTime(new Date());
        int insertTeamId = teamMapper.insertSelective(team);
        TeamMember teamMember = new TeamMember();
        teamMember.setCreateTime(new Date());
        teamMember.setModifyTime(new Date());
        teamMember.setStatus(3);
        teamMember.setTeamId(insertTeamId);
        teamMember.setUserId(team.getLeaderId());
        teamMemberMapper.insert(teamMember);
        logger.info("添加团队信息成功！");
        return selectOneTeamByTeamId(insertTeamId);
    }

    @Override
    public BaseResult selectOneTeamByTeamId(int teamId) {
        if (0 == teamId) {
            logger.info("团队ID传入非法！");
            return BaseResult.createBadRequest();
        }
        Team team = teamMapper.selectByPrimaryKey(teamId);
        logger.info("获取团队信息成功！团队信息为{}", team);
        return BaseResult.create(200, team, "获取团队信息成功！");
    }

    @Override
    public BaseResult updateTeam(Integer teamId, Team team) {
        if (teamId != team.getId()) {
            logger.info("更新的团队ID为非法");
            return BaseResult.createBadRequest();
        }
        team.setModifyTime(new Date());
        int resultTeamId = teamMapper.updateByPrimaryKey(team);
        logger.info("更新团队信息成功，更新的团队ID为：{}", resultTeamId);
        return selectOneTeamByTeamId(resultTeamId);
    }

    @Override
    public BaseResult updateTeamStatus(Integer teamId, Integer teamStatus) {
        Team team = teamMapper.selectByPrimaryKey(teamId);
        team.setTeamStauts(teamStatus);
        team.setModifyTime(new Date());
        int updateTeam = teamMapper.updateByPrimaryKeySelective(team);
        logger.info("更新信息的活动ID为：{}", updateTeam);
        return selectOneTeamByTeamId(updateTeam);

    }

    @Override
    public BaseResult updateTeamMemberStatus(Integer volunteerId, Integer status) {
        teamMemberExample = new TeamMemberExample();
        teamMemberExample.createCriteria().andUserIdEqualTo(volunteerId);
        TeamMember teamMember = teamMemberMapper.selectByExample(teamMemberExample).get(0);
        teamMember.setStatus(status);
        teamMember.setModifyTime(new Date());
        if(3 == status){
            Team team = teamMapper.selectByPrimaryKey(teamMember.getTeamId());
            team.setMemberNum(team.getMemberNum()+1);
            teamMapper.updateByPrimaryKeySelective(team);
        }
        return BaseResult.createOk("修改成功!");
    }

    @Override
    public BaseResult getAllTeamInfo(Integer volunteerId) {
        AllTeamInfo allTeamInfo = new AllTeamInfo();
        Team team = (Team) selectTeamByLeaderId(volunteerId).getData();
        if(team == null){
            allTeamInfo.setIsLeader(false);
        }else{
            allTeamInfo.setIsLeader(true);
        }
        teamMemberExample = new TeamMemberExample();
        teamMemberExample.createCriteria().andUserIdEqualTo(volunteerId);
        allTeamInfo.setJoinTeam(true);
        if(null ==teamMemberMapper.selectByExample(teamMemberExample)){
            allTeamInfo.setJoinTeam(false);
            teamExample = new TeamExample();
            teamExample.createCriteria().andIdIsNotNull();
            List<Team> teams = teamMapper.selectByExample(teamExample);
            List<TeamAndLeaderInfo> list = new ArrayList<>();
            for(Team team1:teams){
                TeamAndLeaderInfo teamAndLeaderInfo = new TeamAndLeaderInfo();
                volunteerExample = new VolunteerExample();
                Volunteer leader1 = volunteerMapper.selectByPrimaryKey(team1.getLeaderId());
                teamAndLeaderInfo.setTeam(team1);
                teamAndLeaderInfo.setVolunteer(leader1);
                list.add(teamAndLeaderInfo);
            }
            allTeamInfo.setTeamAndLeaderInfos(list);
        }else{
            TeamMember teamMember = teamMemberMapper.selectByExample(teamMemberExample).get(0);
            int teamId = teamMember.getTeamId();
            team = (Team)selectOneTeamByTeamId(teamId).getData();
            volunteerExample = new VolunteerExample();
            Volunteer leader = volunteerMapper.selectByPrimaryKey(team.getLeaderId());
            TeamAndLeaderInfo teamAndLeaderInfo = new TeamAndLeaderInfo();
            teamAndLeaderInfo.setVolunteer(leader);
            teamAndLeaderInfo.setTeam(team);
            List<TeamAndLeaderInfo> list = new ArrayList<>();
            list.add(teamAndLeaderInfo);
            allTeamInfo.setTeamAndLeaderInfos(list);
            teamMemberExample = new TeamMemberExample();
            teamMemberExample.createCriteria().andTeamIdEqualTo(team.getId());
            List<TeamMember> teamMembers = teamMemberMapper.selectByExample(teamMemberExample);
            List<Volunteer> volunteers = new ArrayList<>();
            for(TeamMember teamMember1: teamMembers){
                Volunteer volunteer = volunteerMapper.selectByPrimaryKey(teamMember1.getUserId());
                volunteer.setVolunteerPwd(teamMember1.getStatus().toString());
                volunteers.add(volunteer);
            }
            allTeamInfo.setVolunteers(volunteers);
        }

        return BaseResult.create(200,allTeamInfo,"获取成功");
    }

    @Override
    public BaseResult addTeamMember(Integer volunteerId, Integer teamId) {
        TeamMember teamMember = new TeamMember();
        teamMember.setStatus(1);
        teamMember.setUserId(volunteerId);
        teamMember.setTeamId(teamId);
        teamMember.setCreateTime(new Date());
        teamMember.setModifyTime(new Date());
        teamMemberMapper.insert(teamMember);
        return BaseResult.createOk("入队成功");
    }
}
