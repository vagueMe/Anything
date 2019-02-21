package com.dllg.ebpay.dao.generator;

import com.dllg.ebpay.model.generator.Role;
import com.dllg.ebpay.model.generator.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    Role selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);
}