package com.zcz.www.service.impl;

import com.zcz.www.dao.UserMapper;
import com.zcz.www.entity.User;
import com.zcz.www.entity.UserExample;
import com.zcz.www.service.UserService;
import com.zcz.www.utils.CollectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZY on 2018/3/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByAccount(String userAccount) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserAccountEqualTo(userAccount);
        List<User> users =userMapper.selectByExample(userExample);
        if(CollectionUtil.isEmpty(users)){
            return null;
        }
        User user = users.get(0);
        return user;
    }
}
