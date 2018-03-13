package com.zcz.www.service;

import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/13.
 */
public interface TeamService {
    BaseResult getAllTeam();
    BaseResult getTeamAndMemberByTeamId(int teamId);
}
