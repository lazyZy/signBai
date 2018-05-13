package com.zcz.www.controller;

import com.zcz.www.dao.TeamMemberMapper;
import com.zcz.www.entity.Admin;
import com.zcz.www.entity.Team;
import com.zcz.www.entity.Volunteer;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.LoginReq;
import com.zcz.www.pojo.UpVolunteerPojo;
import com.zcz.www.service.TeamService;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZY on 2018/4/2.
 */
@Controller
@RequestMapping(Const.REGISTER_PREFIX)
public class RegisterController {
    @Autowired
    UserService userService;
    @Autowired
    TeamService teamService;
    @Autowired
    TeamMemberMapper teamMemberMapper;

    @RequestMapping("/admin")
    @ResponseBody
    public BaseResult getAdmin(@RequestBody Admin admin) {
        return userService.addAdmin(admin);
    }

    @RequestMapping("/volunteer")
    @ResponseBody
    public BaseResult getUser(@RequestBody Volunteer volunteer) {

        return userService.addVolunteer(volunteer);
    }

    @RequestMapping("/team")
    @ResponseBody
    public BaseResult getUser(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @RequestMapping("/upVolunteer")
    @ResponseBody
    public BaseResult upVolunteer(@RequestBody UpVolunteerPojo upVolunteerPojo) {
        Volunteer volunteer = upVolunteerPojo.getVolunteer();
        LoginReq loginReq = upVolunteerPojo.getLoginReq();
        return userService.updateVolunteer(loginReq,volunteer);
    }

}
