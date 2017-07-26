package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retloh.dao.VerificationMapper;
import com.retloh.model.Verification;
import com.retloh.model.VerificationExample;
import com.retloh.service.VerificationServices;

@Service
public class VerificationServicesImpl implements VerificationServices{
	@Autowired
	private VerificationMapper verificationMapper;

	@Override
	public List<Verification> selectByExample(VerificationExample example) {
		// TODO Auto-generated method stub
		return verificationMapper.selectByExample(example);
	}
	
	@Override
	public int insert(Verification verification){
		return verificationMapper.insert(verification);
	}

	@Override
	public int updateByPrimaryKeySelective(Verification record) {
		// TODO Auto-generated method stub
		return verificationMapper.updateByPrimaryKeySelective(record);
	}
	
	

}
