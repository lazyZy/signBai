package com.zcz.www.service;

import com.zcz.www.entity.User;

/**
 * Created by ZY on 2018/3/10.
 */
public interface UserService {
    User selectUserByAccount(String userAccount);
}
