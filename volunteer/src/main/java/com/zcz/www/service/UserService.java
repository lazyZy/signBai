package com.zcz.www.service;

import com.zcz.www.pojo.BaseResult;

/**
 * Created by ZY on 2018/3/10.
 */
public interface UserService {
    //通过邮箱与密码获取管理员信息
    BaseResult selectAdminByEmailAndPwd(String userEmail ,String userPwd);
    //通过邮箱与密码获取管理员信息
    BaseResult selectVolunteerByEmailAndPwd(String userEmail ,String userPwd);
    //获取所有管理员信息
    BaseResult selectAdminList();
    //获取所有志愿者信息
    BaseResult selectVolunteerList();
}
