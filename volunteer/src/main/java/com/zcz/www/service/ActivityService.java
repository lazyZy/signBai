package com.zcz.www.service;

import com.zcz.www.entity.Activity;
import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/15.
 */
public interface ActivityService {
    //查看所有活动
    BaseResult selectAllActivity();

    //通过活动ID获取活动信息
    BaseResult selectActivityByActivityId(Integer activityId);

    //通过活动团队ID获取活动信息
    BaseResult selectActivityByTeamId(Integer teamId);

    //通过活动团队ID获取活动信息
    BaseResult selectActivityByTeamId2(Integer teamId);

    //通过活动团队ID获取活动信息(不考虑时间)
    BaseResult selectActivityByTeamIdTime(Integer teamId);

    //通过活动状态获取活动信息
    BaseResult selectActivityByActivityStatusAndTeamId(Integer activityStatus, Integer teamId);

    //获取成员可报名活动
    BaseResult selectActivityEnrolment(Integer volunteerId);

    //添加活动
    BaseResult addActivity(Activity activity);

    //通过ID更新活动状态
    BaseResult updateActivityStatus(Integer activityId, Integer status);

    //通过ID更新活动
    BaseResult updateActivity(Activity activity);

    //查询成员是否参加该活动
    Integer isJoin(Integer activityId, Integer volunteerId);

    //成员参加活动
    BaseResult toJoinActivity(Integer activityId, Integer volunteerId);

    //获取正在进行或者已完成的活动
    BaseResult getDoOrFinishActivity();

    //获取对应活动的成员申请状态
    BaseResult getActivityJoin(Integer teamId);

    //队长核实成员可参加活动
    BaseResult toAllowJoin(Integer volunteerId, Integer activityId);
}