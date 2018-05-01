package com.zcz.www.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zcz.www.dao.ActivityMapper;
import com.zcz.www.dao.ActivityUserMapper;
import com.zcz.www.dao.VolunteerMapper;
import com.zcz.www.entity.*;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.MemberAndActivity;
import com.zcz.www.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ZY on 2018/3/15.
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    protected Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);

    @Autowired
    ActivityExample activityExample;
    @Autowired
    ActivityMapper activityMapper;
    @Autowired
    ActivityUserExample activityUserExample;
    @Autowired
    ActivityUserMapper activityUserMapper;
    @Autowired
    VolunteerMapper volunteerMapper;



    @Override
    public BaseResult selectAllActivity() {
        activityExample = new ActivityExample();
        activityExample.createCriteria().andIdIsNotNull();
        List<Activity> activitys = activityMapper.selectByExample(activityExample);
        logger.info("获取所有活动信息成功");
        return BaseResult.create(200, activitys, "获取所有活动信息成功");
    }

    @Override
    public BaseResult selectActivityByActivityId(Integer activityId) {
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        logger.info("获取ID为：{}的活动信息成功！详细信息为：{}", activityId, activity.toString());
        return BaseResult.create(200, activity, "获取ID为：" + activityId + "的活动信息成功！");
    }

    @Override
    public BaseResult selectActivityByTeamId(Integer teamId) {
        activityExample = new ActivityExample();
        if(teamId == null){
            List<Activity> activities = new ArrayList<Activity>();
            return BaseResult.create(200, activities,"尚未加入团队");
        }
        activityExample.createCriteria().andTeamIdEqualTo(teamId).andStartTimeGreaterThan(new Date());
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return BaseResult.create(200, activities,"获取活动信息成功");
    }

    @Override
    public BaseResult selectActivityByTeamId2(Integer teamId){
        activityExample = new ActivityExample();
        if(teamId == null){
            List<Activity> activities = new ArrayList<Activity>();
            return BaseResult.create(200, activities,"尚未加入团队");
        }
        activityExample.createCriteria().andTeamIdEqualTo(teamId);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return BaseResult.create(200, activities,"获取活动信息成功");
    }

    @Override
    public BaseResult selectActivityByTeamIdTime(Integer teamId) {
        activityExample = new ActivityExample();
        if(teamId == null){
            List<Activity> activities = new ArrayList<Activity>();
            return BaseResult.create(200, activities,"尚未加入团队");
        }
        activityExample.createCriteria().andTeamIdEqualTo(teamId);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return BaseResult.create(200, activities,"获取活动信息成功");
    }

    @Override
    public BaseResult selectActivityByActivityStatusAndTeamId(Integer activityStatus, Integer teamId) {
        activityExample = new ActivityExample();
        activityExample.createCriteria().andStatusEqualTo(activityStatus).andTeamIdEqualTo(teamId);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        logger.info("获取当前状态为：" + activityStatus + "的活动信息成功！");
        return BaseResult.create(200, activities, "获取当前状态为：" + activityStatus + "的活动信息成功！");
    }

    @Override
    public BaseResult selectActivityEnrolment(Integer volunteerId) {
        return null;
    }

    @Override
    public BaseResult addActivity(Activity activity) {
        if (activity.getId() != null) {
            logger.info("添加活动信息失败!");
            return BaseResult.createBadRequest();
        }
        int activityId = activityMapper.insertSelective(activity);
        logger.info("插入ID为：{}的活动信息成功！", activityId);
        return selectActivityByActivityId(activityId);
    }

    @Override
    public BaseResult updateActivityStatus(Integer activityId , Integer status) {
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        activity.setStatus(status);
        int updateActivityId = activityMapper.updateByPrimaryKeySelective(activity);
        logger.info("更新信息的活动ID为：{}", updateActivityId);
        return selectActivityByActivityId(updateActivityId);
    }

    @Override
    public BaseResult updateActivity(Activity activity) {
        int updateActivityId = activityMapper.updateByPrimaryKeySelective(activity);
        logger.info("更新信息的活动ID为：{}", updateActivityId);
        return selectActivityByActivityId(updateActivityId);
    }

    @Override
    public Integer isJoin(Integer activityId, Integer volunteerId) {
        logger.info("进入判断加入活动方法");
        activityUserExample = new ActivityUserExample();
        activityUserExample.createCriteria().andActivityIdEqualTo(activityId).andUserIdEqualTo(volunteerId);
        List<ActivityUser> list = activityUserMapper.selectByExample(activityUserExample);
        Integer flag = 1;
        if(list.size() > 0){
            ActivityUser activityUser = list.get(0);
            flag = activityUser.getJoinStatus();
        }
        return flag;
    }

    @Override
    public BaseResult toJoinActivity(Integer activityId, Integer volunteerId) {
        logger.info("进入参加活动方法");
        ActivityUser activityUser = new ActivityUser();
        activityUser.setActivityId(activityId);
        activityUser.setUserId(volunteerId);
        activityUser.setJoinStatus(2);
        activityUser.setCreateTime(new Date());
        activityUserMapper.insertSelective(activityUser);
        return BaseResult.createOk("报名成功！等待队长审核......");
    }

    @Override
    public BaseResult getDoOrFinishActivity() {
        activityExample = new ActivityExample();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        activityExample.createCriteria().andStartTimeLessThan(new Date()).andStatusIn(list);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        logger.info("请求数据{}",JSONObject.toJSONString(activities));
        return BaseResult.create(200,activities,"获取成功");
    }

    @Override
    public BaseResult getActivityJoin(Integer teamId) {
        activityExample = new ActivityExample();
        activityExample.createCriteria().andStartTimeGreaterThan(new Date()).andTeamIdEqualTo(teamId).andStatusEqualTo(2);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        List<MemberAndActivity> memberAndActivities = new ArrayList<>();
        for(Activity activity:activities){
            MemberAndActivity memberAndActivity = new MemberAndActivity();
            memberAndActivity.setActivityName(activity.getName());
            memberAndActivity.setActivityRegion(activity.getRegion());
            memberAndActivity.setActivityId(activity.getId());
            memberAndActivity.setStatus(2);
            activityUserExample = new ActivityUserExample();
            activityUserExample.createCriteria().andActivityIdEqualTo(activity.getId()).andJoinStatusEqualTo(2);
            List<ActivityUser> activityUsers = activityUserMapper.selectByExample(activityUserExample);
            for(ActivityUser activityUser:activityUsers){
                Volunteer volunteer = volunteerMapper.selectByPrimaryKey(activityUser.getUserId());
                memberAndActivity.setVolunteerMail(volunteer.getVolunteerMail());
                memberAndActivity.setVolunteerName(volunteer.getVolunteerName());
                memberAndActivity.setVolunteerPhone(volunteer.getVolunteerPhone());
                memberAndActivity.setVolunteerId(volunteer.getId());
                memberAndActivities.add(memberAndActivity);
            }
        }
        return BaseResult.create(200,memberAndActivities,"获取数据成功");
    }

    @Override
    public BaseResult toAllowJoin(Integer volunteerId, Integer activityId) {
        activityUserExample = new ActivityUserExample();
        activityUserExample.createCriteria().andActivityIdEqualTo(activityId).andUserIdEqualTo(volunteerId).andJoinStatusEqualTo(2);
        ActivityUser activityUser = activityUserMapper.selectByExample(activityUserExample).get(0);
        activityUser.setJoinStatus(3);
        activityUserMapper.updateByExampleSelective(activityUser,activityUserExample);
        return BaseResult.createOk("更新成功");
    }
}
