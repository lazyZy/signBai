package com.zcz.www.controller;

import com.zcz.www.service.ActivityService;
import com.zcz.www.service.TeamService;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
