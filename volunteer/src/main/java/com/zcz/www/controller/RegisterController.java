package com.zcz.www.controller;

import com.zcz.www.entity.Team;
import com.zcz.www.entity.Volunteer;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.LoginReq;
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

    @RequestMapping("/admin")
    @ResponseBody
    public BaseResult getAdmin(@RequestBody LoginReq loginReq) {

        BaseResult baseResult = userService.selectAdminByEmailAndPwd(loginReq.getEmail(), loginReq.getPwd());
        if (baseResult.getCode() == 200) {
            return baseResult;
        }

        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/volunteer")
    @ResponseBody
    public BaseResult getUser(@RequestBody Volunteer volunteer) {

        BaseResult baseResult = userService.addVolunteer(volunteer);
        if (baseResult.getCode() == 200) {
            return baseResult;
        }
        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/team")
    @ResponseBody
    public BaseResult getUser(@RequestBody Team team) {

        BaseResult baseResult = teamService.addTeam(team);
        if (baseResult.getCode() == 200) {
            return baseResult;
        }
        return BaseResult.createFail(400, "失败");
    }
}
