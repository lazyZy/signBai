package com.zcz.www.service;

import com.zcz.www.entity.Team;
import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/13.
 */
public interface TeamService {
    //查看所有团队
    BaseResult selectAllTeam();

    //通过团队ID获取团队详细信息
    BaseResult selectTeamAndMemberByTeamId(int teamId);

    //通过队长ID获取团队详细信息
    BaseResult selectTeamByLeaderId(int teamLeaderId);

    //添加团队
    BaseResult addTeam(Team team);

    //通过团队ID查找团队信息
    BaseResult selectOneTeamByTeamId(int teamId);

    //通过ID更新团队
    BaseResult updateTeam(Integer teamId, Team team);
}
