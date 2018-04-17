package com.zcz.www.controller;

import com.zcz.www.utils.Const;
import com.zcz.www.utils.htmlConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZY on 2018/3/29.
 */
@Controller
@RequestMapping(Const.PAGE_PREFIX)
public class PageController {
    Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/index")
    public String toIndex() {
        logger.info("进入首页");
        return htmlConst.indexPage;
    }

    @RequestMapping("/login")
    public String toLogin() {
        logger.info("进入登录页");
        return htmlConst.loginPage;
    }

    @RequestMapping("/register")
    public String toRegister() {
        logger.info("进入注册页");
        return htmlConst.registerPage;
     }

    @RequestMapping("/adminIndex")
    public String toAdminIndex() {
        logger.info("进入管理员首页");
        return htmlConst.adminIndexPage;
    }

    @RequestMapping("/volunteerIndex")
    public String toVolunteerIndex() {
        logger.info("进入管理员首页");
        return htmlConst.volunteerIndexPage;
    }

    @RequestMapping("/admin_activity")
    public String toAdminActivity() {
        logger.info("进入管理员活动页");
        return htmlConst.adminActivityPage;
    }

    @RequestMapping("/admin_register")
    public String toAdminRegister() {
        logger.info("进入管理员注册页");
        return htmlConst.adminRegisterPage;
    }

    @RequestMapping("/admin_volunteer")
    public String toAdminVolunteer() {
        logger.info("进入管理员-志愿者页");
        return htmlConst.adminVolunteerPage;
    }

    @RequestMapping("/volunteer_team")
    public String toVolunteerTeam() {
        logger.info("进入志愿者-团队页");
        return htmlConst.volunteerTeamPage;
    }

    @RequestMapping("/volunteer_activity")
    public String toVolunteerActivity() {
        logger.info("进入志愿者活动页");
        return htmlConst.volunteerActivityPage;
    }

    @RequestMapping("/register_team")
    public String toRegisterTeam() {
        logger.info("进入团队注册页");
        return htmlConst.registerTeamPage;
    }
}
