package com.zcz.www.controller;

import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZY on 2018/3/10.
 */
@Controller
@RequestMapping(Const.LOGIN_PREFIX)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/info/{account}")
    @ResponseBody
    public ModelAndView getUser(ModelAndView modelAndView , @PathVariable ("account") String account){
        Jedis jedis = new Jedis();
        jedis.set("name","zhaoyi");
        JedisPool jedisPool;

        modelAndView.setViewName("login");
        modelAndView.addObject("sysUser", "SysUser");
       userService.equals("");
        return modelAndView;
    }
}
