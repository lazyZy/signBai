package com.zcz.www.entity;

import com.zcz.www.utils.DateUtils;

import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table volunteer
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Volunteer {
    /**
     * Database Column Remarks:
     * 主键ID
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     * 志愿者姓名
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_name
     *
     * @mbg.generated
     */
    private String volunteerName;

    /**
     * Database Column Remarks:
     * 志愿者性别，0为“未填写”，1为“男”，2为“女”
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_sex
     *
     * @mbg.generated
     */
    private Integer volunteerSex;

    /**
     * Database Column Remarks:
     * 志愿者手机号
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_phone
     *
     * @mbg.generated
     */
    private String volunteerPhone;

    /**
     * Database Column Remarks:
     * 志愿者邮箱
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_mail
     *
     * @mbg.generated
     */
    private String volunteerMail;

    /**
     * Database Column Remarks:
     * 志愿者密码
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_pwd
     *
     * @mbg.generated
     */
    private String volunteerPwd;

    /**
     * Database Column Remarks:
     * 志愿者地址
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.volunteer_adrress
     *
     * @mbg.generated
     */
    private String volunteerAdrress;

    /**
     * Database Column Remarks:
     * 创建时间
     * <p>
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column volunteer.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.id
     *
     * @return the value of volunteer.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.id
     *
     * @param id the value for volunteer.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_name
     *
     * @return the value of volunteer.volunteer_name
     * @mbg.generated
     */
    public String getVolunteerName() {
        return volunteerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_name
     *
     * @param volunteerName the value for volunteer.volunteer_name
     * @mbg.generated
     */
    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName == null ? null : volunteerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_sex
     *
     * @return the value of volunteer.volunteer_sex
     * @mbg.generated
     */
    public Integer getVolunteerSex() {
        return volunteerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_sex
     *
     * @param volunteerSex the value for volunteer.volunteer_sex
     * @mbg.generated
     */
    public void setVolunteerSex(Integer volunteerSex) {
        this.volunteerSex = volunteerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_phone
     *
     * @return the value of volunteer.volunteer_phone
     * @mbg.generated
     */
    public String getVolunteerPhone() {
        return volunteerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_phone
     *
     * @param volunteerPhone the value for volunteer.volunteer_phone
     * @mbg.generated
     */
    public void setVolunteerPhone(String volunteerPhone) {
        this.volunteerPhone = volunteerPhone == null ? null : volunteerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_mail
     *
     * @return the value of volunteer.volunteer_mail
     * @mbg.generated
     */
    public String getVolunteerMail() {
        return volunteerMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_mail
     *
     * @param volunteerMail the value for volunteer.volunteer_mail
     * @mbg.generated
     */
    public void setVolunteerMail(String volunteerMail) {
        this.volunteerMail = volunteerMail == null ? null : volunteerMail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_pwd
     *
     * @return the value of volunteer.volunteer_pwd
     * @mbg.generated
     */
    public String getVolunteerPwd() {
        return volunteerPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_pwd
     *
     * @param volunteerPwd the value for volunteer.volunteer_pwd
     * @mbg.generated
     */
    public void setVolunteerPwd(String volunteerPwd) {
        this.volunteerPwd = volunteerPwd == null ? null : volunteerPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.volunteer_adrress
     *
     * @return the value of volunteer.volunteer_adrress
     * @mbg.generated
     */
    public String getVolunteerAdrress() {
        return volunteerAdrress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.volunteer_adrress
     *
     * @param volunteerAdrress the value for volunteer.volunteer_adrress
     * @mbg.generated
     */
    public void setVolunteerAdrress(String volunteerAdrress) {
        this.volunteerAdrress = volunteerAdrress == null ? null : volunteerAdrress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.create_time
     *
     * @return the value of volunteer.create_time
     * @mbg.generated
     */
    public String getCreateTime() {
        return DateUtils.getFormate(createTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.create_time
     *
     * @param createTime the value for volunteer.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column volunteer.modify_time
     *
     * @return the value of volunteer.modify_time
     * @mbg.generated
     */
    public String getModifyTime() {
        return DateUtils.getFormate(modifyTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column volunteer.modify_time
     *
     * @param modifyTime the value for volunteer.modify_time
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "id=" + id +
                ", volunteerName='" + volunteerName + '\'' +
                ", volunteerSex=" + volunteerSex +
                ", volunteerPhone='" + volunteerPhone + '\'' +
                ", volunteerMail='" + volunteerMail + '\'' +
                ", volunteerPwd='" + volunteerPwd + '\'' +
                ", volunteerAdrress='" + volunteerAdrress + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}