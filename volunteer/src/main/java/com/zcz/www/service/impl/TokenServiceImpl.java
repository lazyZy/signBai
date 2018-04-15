package com.zcz.www.service.impl;

import com.zcz.www.jedis.JedisClientPool;
import com.zcz.www.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by ZY on 2018/4/5.
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    JedisClientPool jedisClientPool;

    @Override
    public String getToken() {
        String token = getUUid();
        jedisClientPool.set(token, "");
        jedisClientPool.expire(token, 60 * 60);
        return token;
    }

    @Override
    public String getInfo(String token) {
        if (checkToken(token)) {
            return jedisClientPool.get(token);
        }
        return null;
    }

    @Override
    public String setInfo(String token, String info) {
        if (checkToken(token)) {
            jedisClientPool.set(token, info);
            jedisClientPool.expire(token, 60 * 60);
        }
        return null;
    }

    @Override
    public boolean checkToken(String token) {
        boolean flag = false;
        if (null != token && jedisClientPool.exists(token)) {
            flag = true;
        }
        return flag;
    }

    public static String getUUid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
