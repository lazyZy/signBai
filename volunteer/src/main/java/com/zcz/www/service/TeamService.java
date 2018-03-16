package com.zcz.www.service;

import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/13.
 */
public interface TeamService {
    //查看所有团队
    BaseResult selectAllTeam();
    //通过团队ID获取团队详细信息
    BaseResult selectTeamAndMemberByTeamId(int teamId);
}
