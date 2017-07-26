package com.retloh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.retloh.model.Verification;
import com.retloh.model.VerificationExample;

public interface VerificationServices {

	List<Verification> selectByExample(VerificationExample example);

	int insert(Verification verification);
	
	int updateByPrimaryKeySelective(Verification record);
	
	int countByExample(VerificationExample example);

    int deleteByExample(VerificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Verification record);

    Verification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByExample(@Param("record") Verification record, @Param("example") VerificationExample example);

    int updateByPrimaryKey(Verification record);

}
