package com.retloh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retloh.dao.BloodPreDataMapper;
import com.retloh.model.BloodPreData;
import com.retloh.service.BloodPreDataServices;

@Service
public class BloodPreDataServicesImpl implements BloodPreDataServices {
	
	@Autowired
	private BloodPreDataMapper bloodPreDataMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(BloodPreData record) {
		return 0;
	}

	@Override
	public int insertSelective(BloodPreData record) {
		return 0;
	}

	@Override
	public BloodPreData selectByPrimaryKey(String id) {
		return null;
	}


	@Override
	public int updateByPrimaryKeySelective(BloodPreData record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(BloodPreData record) {
		return 0;
	}

}
