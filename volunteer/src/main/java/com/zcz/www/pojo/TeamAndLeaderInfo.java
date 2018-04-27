package com.zcz.www.pojo;

import com.zcz.www.entity.Team;
import com.zcz.www.entity.Volunteer;

/**
 * Created by ZY on 2018/4/26.
 */
public class TeamAndLeaderInfo {
    private Team team;
    private Volunteer volunteer;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
}
