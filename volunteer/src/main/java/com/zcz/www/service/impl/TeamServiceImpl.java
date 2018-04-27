package com.zcz.www.service.impl;

import com.zcz.www.dao.TeamMapper;
import com.zcz.www.dao.TeamMemberMapper;
import com.zcz.www.dao.VolunteerMapper;
import com.zcz.www.entity.*;
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
        int updateTeam = teamMapper.updateByPrimaryKeySelective(team);
        logger.info("更新信息的活动ID为：{}", updateTeam);
        return selectOneTeamByTeamId(updateTeam);

    }
}
