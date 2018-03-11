package com.zcz.www.controller;

import com.zcz.www.entity.User;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

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
    public User getUser(@PathVariable ("account") String account ){
        Jedis jedis = new Jedis();
        jedis.set("name","zhaoyi");
        JedisPool jedisPool;
        return userService.selectUserByAccount(account);
    }
}
