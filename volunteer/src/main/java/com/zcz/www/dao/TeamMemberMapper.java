package com.zcz.www.dao;

import com.zcz.www.entity.TeamMember;
import com.zcz.www.entity.TeamMemberExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    long countByExample(TeamMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int deleteByExample(TeamMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int insert(TeamMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int insertSelective(TeamMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    List<TeamMember> selectByExample(TeamMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    TeamMember selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TeamMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table team_member
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TeamMember record);
}