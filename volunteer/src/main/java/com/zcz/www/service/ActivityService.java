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

    //通过活动状态获取活动信息
    BaseResult selectActivityByActivityStatus(Integer activityStatus);

    //添加活动
    BaseResult addActivity(Activity activity);

    //通过ID更新活动状态
    BaseResult updateActivityStatus(Integer activityId , Integer status);

    //通过ID更新活动
    BaseResult updateActivity(Activity activity);
}
