package com.zcz.www.entity;

import com.zcz.www.utils.DateUtils;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table activity
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Activity {
    /**
     * Database Column Remarks:
     * 主键ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     * 团队ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.team_id
     *
     * @mbg.generated
     */
    private Integer teamId;

    /**
     * Database Column Remarks:
     * 联系人ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.leader_id
     *
     * @mbg.generated
     */
    private Integer leaderId;

    /**
     * Database Column Remarks:
     * 活动名称
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     * 活动区域
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.region
     *
     * @mbg.generated
     */
    private String region;

    /**
     * Database Column Remarks:
     * 活动状态
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     * 活动介绍
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.introduce
     *
     * @mbg.generated
     */
    private String introduce;

    /**
     * Database Column Remarks:
     * 活动总结
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     * Database Column Remarks:
     * 创建时间
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     * 开始时间
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     * 结束时间
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.id
     *
     * @return the value of activity.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.id
     *
     * @param id the value for activity.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.team_id
     *
     * @return the value of activity.team_id
     * @mbg.generated
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.team_id
     *
     * @param teamId the value for activity.team_id
     * @mbg.generated
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.leader_id
     *
     * @return the value of activity.leader_id
     * @mbg.generated
     */
    public Integer getLeaderId() {
        return leaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.leader_id
     *
     * @param leaderId the value for activity.leader_id
     * @mbg.generated
     */
    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.name
     *
     * @return the value of activity.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.name
     *
     * @param name the value for activity.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.region
     *
     * @return the value of activity.region
     * @mbg.generated
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.region
     *
     * @param region the value for activity.region
     * @mbg.generated
     */
    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.status
     *
     * @return the value of activity.status
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.status
     *
     * @param status the value for activity.status
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.introduce
     *
     * @return the value of activity.introduce
     * @mbg.generated
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.introduce
     *
     * @param introduce the value for activity.introduce
     * @mbg.generated
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.summary
     *
     * @return the value of activity.summary
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.summary
     *
     * @param summary the value for activity.summary
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.create_time
     *
     * @return the value of activity.create_time
     * @mbg.generated
     */
    public String getCreateTime() {
        return DateUtils.getFormate(createTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.create_time
     *
     * @param createTime the value for activity.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.start_time
     *
     * @return the value of activity.start_time
     * @mbg.generated
     */
    public String getStartTime() {
        return DateUtils.getFormate(startTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.start_time
     *
     * @param startTime the value for activity.start_time
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.end_time
     *
     * @return the value of activity.end_time
     * @mbg.generated
     */
    public String getEndTime() {
        return DateUtils.getFormate(endTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.end_time
     *
     * @param endTime the value for activity.end_time
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", teamId=" + teamId +
                ", leaderId=" + leaderId +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", status=" + status +
                ", introduce='" + introduce + '\'' +
                ", summary='" + summary + '\'' +
                ", createTime=" + createTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}