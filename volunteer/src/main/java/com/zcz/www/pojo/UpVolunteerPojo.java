package com.zcz.www.pojo;

import com.zcz.www.entity.Volunteer;

/**
 * Created by ZY on 2018/5/14.
 */
public class UpVolunteerPojo {
    private Volunteer volunteer;
    private LoginReq loginReq;

    public UpVolunteerPojo() {
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public LoginReq getLoginReq() {
        return loginReq;
    }

    public void setLoginReq(LoginReq loginReq) {
        this.loginReq = loginReq;
    }

    public UpVolunteerPojo(Volunteer volunteer, LoginReq loginReq) {
        this.volunteer = volunteer;
        this.loginReq = loginReq;
    }
}
