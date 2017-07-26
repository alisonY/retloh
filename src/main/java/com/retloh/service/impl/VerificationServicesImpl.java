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

	@Override
	public int countByExample(VerificationExample example) {
		// TODO Auto-generated method stub
		return verificationMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(VerificationExample example) {
		// TODO Auto-generated method stub
		return verificationMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return verificationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(Verification record) {
		// TODO Auto-generated method stub
		return verificationMapper.insertSelective(record);
	}

	@Override
	public Verification selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return verificationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Verification record, VerificationExample example) {
		// TODO Auto-generated method stub
		return verificationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Verification record, VerificationExample example) {
		// TODO Auto-generated method stub
		return verificationMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKey(Verification record) {
		// TODO Auto-generated method stub
		return verificationMapper.updateByPrimaryKey(record);
	}
	
	

}
