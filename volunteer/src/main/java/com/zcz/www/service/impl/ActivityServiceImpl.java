package com.zcz.www.service.impl;

import com.zcz.www.dao.ActivityMapper;
import com.zcz.www.entity.Activity;
import com.zcz.www.entity.ActivityExample;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Override
    public BaseResult selectAllActivity() {
        activityExample.createCriteria().andIdIsNotNull();
        List<Activity> activitys = activityMapper.selectByExample(activityExample);
        return null;
    }

    @Override
    public BaseResult selectActivityByActivityId(Integer activityId) {
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        return null;
    }

    @Override
    public BaseResult selectActivityByActivityStatus(Integer activityStatus) {
        activityExample.createCriteria().andStatusEqualTo(activityStatus);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        return null;
    }

    @Override
    public BaseResult addActivity(Activity activity) {
        if(activity.getId() != null){
            return null;
        }
        int activityId =activityMapper.insertSelective(activity);
        return null;
    }

    @Override
    public BaseResult updateActivity(Integer activityId, Activity activity) {
        int updateActivityId = activityMapper.updateByPrimaryKeySelective(activity);
        if(updateActivityId != activityId){
            return null;
        }
        return null;
    }
}
