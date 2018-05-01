package com.zcz.www.controller;

import com.zcz.www.entity.Activity;
import com.zcz.www.entity.Team;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.IsJoin;
import com.zcz.www.pojo.SummaryActivity;
import com.zcz.www.pojo.VolunteerIndexPojo;
import com.zcz.www.service.ActivityService;
import com.zcz.www.service.TeamService;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ZY on 2018/4/6.
 */
@Controller
@RequestMapping(Const.VOLUNTEER_PREFIX)
public class VolunteerController {
    Logger logger = LoggerFactory.getLogger(VolunteerController.class);
    @Autowired
    TeamService teamService;
    @Autowired
    ActivityService activityService;
    @Autowired
    UserService userService;

    @RequestMapping("/getActivity")
    @ResponseBody
    public BaseResult getActivity(@RequestParam Integer volunteerId) {
        VolunteerIndexPojo volunteerIndexPojo = new VolunteerIndexPojo();
        volunteerIndexPojo.setTeam((Team)teamService.selectTeamByLeaderId(volunteerId).getData());
        volunteerIndexPojo.setActivities((List<Activity>)activityService.selectActivityByTeamId(volunteerIndexPojo.getTeam().getId()).getData());
        List<Integer> joinStatus = volunteerIndexPojo.getActivities().stream().map(activity -> activityService.isJoin(activity.getId(), volunteerId)).collect(Collectors.toList());
        volunteerIndexPojo.setIsJoin(joinStatus);
        if(volunteerIndexPojo.getTeam().getLeaderId() == volunteerId){
            volunteerIndexPojo.setLeader(true);
        }
        return BaseResult.create(200,volunteerIndexPojo,"获取成功！");
    }

    @RequestMapping("/getActivityByStatus")
    @ResponseBody
    public BaseResult getActivityByStatus(@RequestParam Integer volunteerId,@RequestParam Integer activityStatus) {
        VolunteerIndexPojo volunteerIndexPojo = new VolunteerIndexPojo();
        volunteerIndexPojo.setTeam((Team)teamService.selectTeamByLeaderId(volunteerId).getData());
        volunteerIndexPojo.setActivities((List<Activity>)activityService.selectActivityByActivityStatusAndTeamId(volunteerIndexPojo.getTeam().getId(),activityStatus).getData());
        if(volunteerIndexPojo.getTeam().getLeaderId() == volunteerId){
            volunteerIndexPojo.setLeader(true);
        }
        return BaseResult.create(200,volunteerIndexPojo,"获取成功！");
    }

    @RequestMapping("/getActivityEnrolment")
    @ResponseBody
    public BaseResult getActivityEnrolment(@RequestParam Integer volunteerId) {

        return BaseResult.create(200,null,"获取成功！");
    }

    @RequestMapping("/toJoinActivity")
    @ResponseBody
    public BaseResult toJoinActivity(@RequestBody IsJoin isJoin) {
        return  activityService.toJoinActivity(isJoin.getActivityId(),isJoin.getVolunteerId());
    }

    @RequestMapping("/getTeamMember")
    @ResponseBody
    public BaseResult getTeamMember(@RequestParam Integer volunteerId) {
        return  teamService.getAllTeamInfo(volunteerId);
    }

    @RequestMapping("/joinTeamCheck")
    @ResponseBody
    public BaseResult joinTeamCheck(@RequestParam Integer volunteerId,@RequestParam Integer status) {
        return teamService.updateTeamMemberStatus(volunteerId,status);
    }

    @RequestMapping("/joinTeam")
    @ResponseBody
    public BaseResult joinTeam(@RequestParam Integer volunteerId,@RequestParam Integer teamId) {
        return teamService.addTeamMember(volunteerId,teamId);
    }

    @RequestMapping("/toFinishActivity")
    @ResponseBody
    public BaseResult toFinishActivity(@RequestBody SummaryActivity summaryActivity) {
        Activity activity = (Activity) activityService.selectActivityByActivityId(summaryActivity.getActivityId()).getData();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date endDate = sdf.parse(activity.getEndTime());
            if(endDate.before(new Date())){
                BaseResult.createFail(400,"未到活动结束时间");
            }
        } catch (ParseException e) {
        }
        activity.setSummary(summaryActivity.getActivitySummary());
        activity.setStatus(3);
        return activityService.updateActivity(activity);
    }


    @RequestMapping("/applyActivity")
    @ResponseBody
    public BaseResult applyActivity(@RequestBody Activity activity) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = sdf.parse(activity.getStartTime());
            Date endDate = sdf.parse(activity.getEndTime());
            if(startDate.after(endDate) || startDate.before(new Date())){
                BaseResult.createFail(300,"时间输入错误，请按正常逻辑输入！");
            }
        } catch (ParseException e) {
            return BaseResult.createFail(400,"请按正确格式输入日期！");
        }
        activity.setStatus(1);
        activity.setCreateTime(new Date());
        return activityService.addActivity(activity);
    }



}
