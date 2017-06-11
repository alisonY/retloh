package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.BloodPreInfoMapper;
import com.retloh.model.BloodPreInfo;
import com.retloh.model.BloodPreInfoExample;
import com.retloh.model.PageQuery;
import com.retloh.service.BloodPreInfoServices;

@Service
public class BloodPreInfoServicesImpl implements BloodPreInfoServices {
	
	@Autowired
	private BloodPreInfoMapper bloodPreInfoMapper; 

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(BloodPreInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(BloodPreInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BloodPreInfo selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int updateByPrimaryKeySelective(BloodPreInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(BloodPreInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<BloodPreInfo> getInfoList(BloodPreInfo record, PageQuery pageQuery) {
		BloodPreInfoExample example = new BloodPreInfoExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return bloodPreInfoMapper.selectByExample(example);
	}

}
