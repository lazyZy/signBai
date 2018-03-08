package com.zcz.www.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table team_member
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TeamMember {
    /**
     * Database Column Remarks:
     *   主键ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   团队ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.team_id
     *
     * @mbg.generated
     */
    private Integer teamId;

    /**
     * Database Column Remarks:
     *   志愿者ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * Database Column Remarks:
     *   志愿者在该队的状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   入团时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   退团时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column team_member.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.id
     *
     * @return the value of team_member.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.id
     *
     * @param id the value for team_member.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.team_id
     *
     * @return the value of team_member.team_id
     *
     * @mbg.generated
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.team_id
     *
     * @param teamId the value for team_member.team_id
     *
     * @mbg.generated
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.user_id
     *
     * @return the value of team_member.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.user_id
     *
     * @param userId the value for team_member.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.status
     *
     * @return the value of team_member.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.status
     *
     * @param status the value for team_member.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.create_time
     *
     * @return the value of team_member.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.create_time
     *
     * @param createTime the value for team_member.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column team_member.modify_time
     *
     * @return the value of team_member.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column team_member.modify_time
     *
     * @param modifyTime the value for team_member.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}