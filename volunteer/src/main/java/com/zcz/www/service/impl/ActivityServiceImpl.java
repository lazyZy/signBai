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
        activityExample = new ActivityExample();
        activityExample.createCriteria().andIdIsNotNull();
        List<Activity> activitys = activityMapper.selectByExample(activityExample);
        logger.info("获取所有活动信息成功");
        return BaseResult.create(200,activitys,"获取所有活动信息成功");
    }

    @Override
    public BaseResult selectActivityByActivityId(Integer activityId) {
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        logger.info("获取ID为：{}的活动信息成功！详细信息为：{}",activityId,activity.toString());
        return BaseResult.create(200,activity,"获取ID为："+activityId+"的活动信息成功！");
    }

    @Override
    public BaseResult selectActivityByActivityStatus(Integer activityStatus) {
        activityExample = new ActivityExample();
        activityExample.createCriteria().andStatusEqualTo(activityStatus);
        List<Activity> activities = activityMapper.selectByExample(activityExample);
        logger.info("获取当前状态为："+activityStatus+"的活动信息成功！");
        return BaseResult.create(200,activities,"获取当前状态为："+activityStatus+"的活动信息成功！");
    }

    @Override
    public BaseResult addActivity(Activity activity) {
        if(activity.getId() != null){
            logger.info("添加活动信息失败!");
            return BaseResult.createBadRequest();
        }
        int activityId =activityMapper.insertSelective(activity);
        logger.info("插入ID为：{}的活动信息成功！",activityId);
        return selectActivityByActivityId(activityId);
    }

    @Override
    public BaseResult updateActivity(Integer activityId, Activity activity) {
        if(null == activity.getId() || activityId != activityId){
            logger.info("更新活动信息失败");
            return BaseResult.createBadRequest();
        }
        int updateActivityId = activityMapper.updateByPrimaryKeySelective(activity);
        logger.info("更新信息的活动ID为：{}",updateActivityId);
        return selectActivityByActivityId(updateActivityId);
    }
}
