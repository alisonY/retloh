package com.retloh.dao;

import com.retloh.model.Verification;
import com.retloh.model.VerificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerificationMapper {
    int countByExample(VerificationExample example);

    int deleteByExample(VerificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Verification record);

    int insertSelective(Verification record);

    List<Verification> selectByExample(VerificationExample example);

    Verification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByExample(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByPrimaryKeySelective(Verification record);

    int updateByPrimaryKey(Verification record);
}