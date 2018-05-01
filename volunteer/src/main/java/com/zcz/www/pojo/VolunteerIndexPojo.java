package com.zcz.www.pojo;

import com.zcz.www.entity.Activity;
import com.zcz.www.entity.Team;
import com.zcz.www.entity.TeamMember;

import java.util.List;

/**
 * Created by ZY on 2018/4/18.
 */
public class VolunteerIndexPojo {
    private Team team;
    private List<TeamMember> teamMemberList;
    private List<Activity> activities;
    private List<Activity> activities2;
    private List<Integer> isJoin;
    private boolean isLeader;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<TeamMember> getTeamMemberList() {
        return teamMemberList;
    }

    public void setTeamMemberList(List<TeamMember> teamMemberList) {
        this.teamMemberList = teamMemberList;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public List<Integer> getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(List<Integer> isJoin) {
        this.isJoin = isJoin;
    }

    public List<Activity> getActivities2() {
        return activities2;
    }

    public void setActivities2(List<Activity> activities2) {
        this.activities2 = activities2;
    }
}
