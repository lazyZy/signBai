package com.zcz.www.controller;

import com.zcz.www.pojo.BaseResult;
import com.zcz.www.pojo.LoginReq;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZY on 2018/3/10.
 */
@Controller
@RequestMapping(Const.LOGIN_PREFIX)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/info")
    @ResponseBody
    public BaseResult getUser(@RequestBody LoginReq loginReq){

        BaseResult baseResult = userService.selectAdminByEmailAndPwd(loginReq.getEmail(),loginReq.getPwd());
        if(baseResult.getCode() == 200){
            return baseResult;
        }

        return BaseResult.createFail(400,"失败");
    }
}
