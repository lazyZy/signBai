package com.zcz.www.service;

/**
 * Created by ZY on 2018/4/5.
 */
public interface TokenService {
    String getToken();

    String getInfo(String token);

    String setInfo(String token, String info);

    boolean checkToken(String token);
}
