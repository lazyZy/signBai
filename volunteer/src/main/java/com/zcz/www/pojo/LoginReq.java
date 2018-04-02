package com.zcz.www.pojo;

/**
 * Created by ZY on 2018/3/12.
 */
public class LoginReq {
    //登录邮箱
    private String email;
    //登录密码
    private String pwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
