package com.zcz.www.pojo;

/**
 * Created by ZY on 2018/5/2.
 */
public class MemberAndActivity {
    private Integer volunteerId;
    private Integer activityId;
    private String volunteerName;
    private String volunteerPhone;
    private String volunteerMail;
    private String ActivityName;
    private String ActivityRegion;
    private Integer status;

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerPhone() {
        return volunteerPhone;
    }

    public void setVolunteerPhone(String volunteerPhone) {
        this.volunteerPhone = volunteerPhone;
    }

    public String getVolunteerMail() {
        return volunteerMail;
    }

    public void setVolunteerMail(String volunteerMail) {
        this.volunteerMail = volunteerMail;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }

    public String getActivityRegion() {
        return ActivityRegion;
    }

    public void setActivityRegion(String activityRegion) {
        ActivityRegion = activityRegion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
