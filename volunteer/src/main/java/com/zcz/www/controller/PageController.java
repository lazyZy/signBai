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
    public String toIndex(){
        logger.info("进入首页");
        return htmlConst.indexPage;
    }

    @RequestMapping("/login")
    public String toLogin(){
        logger.info("进入登录页");
        return htmlConst.loginPage;
    }

    @RequestMapping("/register")
    public String toRegister(){
        logger.info("进入注册页");
        return htmlConst.registerPage;
    }
}
