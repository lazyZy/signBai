package com.zcz.www.pojo;

import com.zcz.www.entity.Volunteer;

import java.util.List;

/**
 * Created by ZY on 2018/5/1.
 */
public class AllTeamInfo {
    private List<Volunteer> volunteers;
    private Volunteer leader;
    private boolean isLeader;
    private boolean isJoinTeam;
    private List<TeamAndLeaderInfo> teamAndLeaderInfos;

    public List<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(List<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public Volunteer getLeader() {
        return leader;
    }

    public void setLeader(Volunteer leader) {
        this.leader = leader;
    }

    public List<TeamAndLeaderInfo> getTeamAndLeaderInfos() {
        return teamAndLeaderInfos;
    }

    public void setTeamAndLeaderInfos(List<TeamAndLeaderInfo> teamAndLeaderInfos) {
        this.teamAndLeaderInfos = teamAndLeaderInfos;
    }

    public boolean getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(boolean leader) {
        isLeader = leader;
    }

    public boolean getIsJoinTeam() {
        return isJoinTeam;
    }

    public void setJoinTeam(boolean joinTeam) {
        isJoinTeam = joinTeam;
    }
}
