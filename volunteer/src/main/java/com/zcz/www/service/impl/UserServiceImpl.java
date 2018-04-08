package com.zcz.www.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zcz.www.dao.AdminMapper;
import com.zcz.www.dao.VolunteerMapper;
import com.zcz.www.entity.Admin;
import com.zcz.www.entity.AdminExample;
import com.zcz.www.entity.Volunteer;
import com.zcz.www.entity.VolunteerExample;
import com.zcz.www.pojo.BaseResult;
import com.zcz.www.service.TokenService;
import com.zcz.www.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by ZY on 2018/3/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private VolunteerMapper volunteerMapper;
    @Autowired
    private AdminExample adminExample;
    @Autowired
    private VolunteerExample volunteerExample;
    @Autowired
    private TokenService tokenService;

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Override
    public BaseResult selectAdminByEmailAndPwd(String userEmail, String userPwd) {
        if (StringUtils.isEmpty(userEmail)) {
            logger.info("selectAdminByEmail:{}", "Email为空！！！");
            return BaseResult.createDataNotFound();
        }
        adminExample = new AdminExample();
        adminExample.createCriteria().andAdminEmailEqualTo(userEmail).andAdminPwdEqualTo(userPwd);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins.size() == 0) {
            logger.info("selectAdminByEmail:{}", "未找到该用户数据，用户名与密码错误！！！");
            return BaseResult.createDataNotFound();
        }
        Admin admin = admins.get(0);
        admin.setAdminPwd("******");
        String key = tokenService.getToken();
        tokenService.setInfo(key, JSONObject.toJSONString(admin));
        return BaseResult.create(200, key, "数据获取成功");
    }

    @Override
    public BaseResult selectVolunteerByEmailAndPwd(String userEmail, String userPwd) {
        if (StringUtils.isEmpty(userEmail)) {
            logger.info("selectVolunteerByEmail:{}", "Email为空！！！");
            return BaseResult.createDataNotFound();
        }
        volunteerExample = new VolunteerExample();
        volunteerExample.createCriteria().andVolunteerMailEqualTo(userEmail).andVolunteerPwdEqualTo(userPwd);
        List<Volunteer> volunteers = volunteerMapper.selectByExample(volunteerExample);
        if (volunteers.size() == 0) {
            logger.info("selectVolunteerByEmail:{}", "未找到该用户数据，用户名与密码错误！！！");
            return BaseResult.createDataNotFound();
        }
        Volunteer volunteer = volunteers.get(0);
        volunteer.setVolunteerPwd("******");
        String key = tokenService.getToken();
        tokenService.setInfo(key, JSONObject.toJSONString(volunteer));
        logger.info(key);
        return BaseResult.create(200, key, "数据获取成功");
    }

    @Override
    public BaseResult selectAdminList() {
        adminExample = new AdminExample();
        adminExample.createCriteria().andIdIsNotNull();
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return null;
    }

    @Override
    public BaseResult selectVolunteerList() {
        volunteerExample = new VolunteerExample();
        volunteerExample.createCriteria().andIdIsNotNull();
        List<Volunteer> volunteers = volunteerMapper.selectByExample(volunteerExample);
        return null;
    }

    @Override
    public BaseResult addAdmin(Admin admin) {
        return null;
    }

    @Override
    public BaseResult addVolunteer(Volunteer volunteer) {
        int volunteerId = volunteerMapper.insertSelective(volunteer);
        if (volunteerId != 0) {
            return BaseResult.create(200, null, "注册成功");
        }
        return BaseResult.createFail(400, "注册失败");
    }

    @Override
    public BaseResult updatAdmin(Integer adminId, Admin admin) {
        return null;
    }

    @Override
    public BaseResult updateVolunteer(Integer volunteerId, Volunteer volunteer) {
        return null;
    }
}
