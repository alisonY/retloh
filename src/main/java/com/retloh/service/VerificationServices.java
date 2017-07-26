package com.retloh.service;

import java.util.List;

import com.retloh.model.Verification;
import com.retloh.model.VerificationExample;

public interface VerificationServices {

	List<Verification> selectByExample(VerificationExample example);

	int insert(Verification verification);
	
	int updateByPrimaryKeySelective(Verification record);

}
