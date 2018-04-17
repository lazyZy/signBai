package com.zcz.www.controller;

import com.zcz.www.pojo.BaseResult;
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

/**
 * Created by ZY on 2018/4/6.
 */
@Controller
@RequestMapping(Const.ADMIN_PREFIX)
public class AdminController {
    Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    ActivityService activityService;
    @Autowired
    TeamService teamService;
    @Autowired
    UserService userService;

    @RequestMapping("/getAllActivity")
    @ResponseBody
    public BaseResult getAllActivity() {

        BaseResult baseResult = activityService.selectAllActivity();
        if (baseResult.getCode() == 200) {
            return baseResult;
        }

        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/adoptActivity")
    @ResponseBody
    public BaseResult adoptActivity(@RequestParam Integer activityId) {
        logger.info("进入/adoptActivity");
        BaseResult baseResult = activityService.updateActivityStatus(activityId,2);
        if (baseResult.getCode() == 200) {
            return baseResult;
        }
        return BaseResult.createFail(400, "失败");
    }

    @RequestMapping("/refuseActivity")
    @ResponseBody
    public BaseResult refuseActivity(@RequestParam Integer activityId) {
        logger.info("进入/refuseActivity");
        BaseResult baseResult = activityService.updateActivityStatus(activityId,0);
        if (baseResult.getCode() == 200) {
            return baseResult;
        }
        return BaseResult.createFail(400, "失败");
    }
}
