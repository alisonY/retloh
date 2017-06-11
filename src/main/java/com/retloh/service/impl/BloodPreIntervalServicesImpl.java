package com.retloh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retloh.dao.BloodPreIntervalMapper;
import com.retloh.model.BloodPreInterval;
import com.retloh.service.BloodPreIntervalServices;

@Service
public class BloodPreIntervalServicesImpl implements BloodPreIntervalServices {
	
	@Autowired
	private BloodPreIntervalMapper bloodPreIntervalMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(BloodPreInterval record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(BloodPreInterval record) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public BloodPreInterval selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updateByPrimaryKeySelective(BloodPreInterval record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(BloodPreInterval record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
