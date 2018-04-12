package com.zcz.www.controller;

import com.alibaba.fastjson.JSON;
import com.zcz.www.entity.Admin;
import com.zcz.www.entity.Volunteer;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.LoginReq;
import com.zcz.www.service.TokenService;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZY on 2018/3/10.
 */
@Controller
@RequestMapping(Const.LOGIN_PREFIX)
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @RequestMapping("/admin")
    @ResponseBody
    public BaseResult getAdmin(@RequestBody LoginReq loginReq) {

        BaseResult baseResult = userService.selectAdminByEmailAndPwd(loginReq.getEmail(), loginReq.getPwd());
        if (baseResult.getCode() == 200) {
            return baseResult;
        }

        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/adminLoginInfo")
    @ResponseBody
    public BaseResult getAdminLoginInfo(@RequestParam("token") String token) {
        String res = tokenService.getInfo(token);
        if (null == res) {
            return BaseResult.createDataNotFound();
        }
        Admin admin = JSON.parseObject(res, Admin.class);

        return BaseResult.create(200, admin, "获取登录信息成功");
    }

    @RequestMapping("/volunteer")
    @ResponseBody
    public BaseResult getVolunteer(@RequestBody LoginReq loginReq) {

        BaseResult baseResult = userService.selectVolunteerByEmailAndPwd(loginReq.getEmail(), loginReq.getPwd());
        if (baseResult.getCode() == 200) {
            return baseResult;
        }

        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/volunteerLoginInfo")
    @ResponseBody
    public BaseResult getVolunteerLoginInfo(@RequestParam("token") String token) {
        String res = tokenService.getInfo(token);
        if (null == res) {
            return BaseResult.createDataNotFound();
        }
        Volunteer volunteer = JSON.parseObject(res, Volunteer.class);

        return BaseResult.create(200, volunteer, "获取登录信息成功");
    }
}
