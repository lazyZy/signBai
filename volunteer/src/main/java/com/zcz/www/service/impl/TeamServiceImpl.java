package com.zcz.www.service.impl;

import com.zcz.www.dao.TeamMapper;
import com.zcz.www.dao.TeamMemberMapper;
import com.zcz.www.dao.VolunteerMapper;
import com.zcz.www.entity.*;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZY on 2018/3/13.
 */
@Service
public class TeamServiceImpl implements TeamService{
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
        teamExample.createCriteria().andIdIsNotNull();
        List<Team> teams = teamMapper.selectByExample(teamExample);
        return BaseResult.create(200,teams,"获取数据成功");
    }

    @Override
    public BaseResult selectTeamAndMemberByTeamId(int teamId) {
        teamMemberExample.createCriteria().andIdEqualTo(teamId).andStatusEqualTo(1);
        List<TeamMember> teamMembers = teamMemberMapper.selectByExample(teamMemberExample);
        List<Integer> teamMemberIds = new ArrayList<>();
        for(TeamMember teamMember : teamMembers){
            teamMemberIds.add(teamMember.getUserId());
        }
        volunteerExample.createCriteria().andIdIn(teamMemberIds);
        List<Volunteer> volunteers = volunteerMapper.selectByExample(volunteerExample);
        return BaseResult.create(200,volunteers,"获取信息成功");
    }
}
