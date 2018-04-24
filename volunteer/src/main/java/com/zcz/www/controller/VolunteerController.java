package com.zcz.www.controller;

import com.zcz.www.entity.Activity;
import com.zcz.www.entity.Team;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.VolunteerIndexPojo;
import com.zcz.www.service.ActivityService;
import com.zcz.www.service.TeamService;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
        if(volunteerIndexPojo.getTeam().getLeaderId() == volunteerId){
            volunteerIndexPojo.setLeader(true);
        }
        return BaseResult.create(200,volunteerIndexPojo,"获取成功！");
    }

}
