package com.zcz.www.dao;

import com.zcz.www.entity.Volunteer;
import com.zcz.www.entity.VolunteerExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VolunteerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    long countByExample(VolunteerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int deleteByExample(VolunteerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int insert(Volunteer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int insertSelective(Volunteer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    List<Volunteer> selectByExample(VolunteerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    Volunteer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Volunteer record, @Param("example") VolunteerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Volunteer record, @Param("example") VolunteerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Volunteer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Volunteer record);
}