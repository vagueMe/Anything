package com.dllg.ebpay.dao.generator;

import com.dllg.ebpay.model.generator.AccountSubBind;
import com.dllg.ebpay.model.generator.AccountSubBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountSubBindMapper {
    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    long countByExample(AccountSubBindExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int deleteByExample(AccountSubBindExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int deleteByPrimaryKey(String accountSubBindId);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int insert(AccountSubBind record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int insertSelective(AccountSubBind record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    List<AccountSubBind> selectByExample(AccountSubBindExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    AccountSubBind selectByPrimaryKey(String accountSubBindId);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AccountSubBind record, @Param("example") AccountSubBindExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByExample(@Param("record") AccountSubBind record, @Param("example") AccountSubBindExample example);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AccountSubBind record);

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    int updateByPrimaryKey(AccountSubBind record);
}