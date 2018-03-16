package com.zcz.www.service;

import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/15.
 */
public interface ActivityService {
    //查看所有活动
    BaseResult selectAllActivity();
    //通过活动ID获取活动信息
    BaseResult selectActivityByActivityId(Integer activityId);
    //通过活动状态获取活动信息
    BaseResult selectActivityByActivityStatus(Integer activityStatus);
}
