package com.zcz.www.service;

import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/10.
 */
public interface UserService {
    BaseResult selectAdminByEmail(String userEmail ,String userPwd);
    BaseResult selectVolunteerByEmail(String userEmail ,String userPwd);
}
