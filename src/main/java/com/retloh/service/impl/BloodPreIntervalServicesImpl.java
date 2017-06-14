package com.retloh.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.BloodPreIntervalMapper;
import com.retloh.model.BloodPreInterval;
import com.retloh.model.BloodPreIntervalExample;
import com.retloh.model.PageQuery;
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

	public List<BloodPreInterval> getIntervalList(BloodPreInterval bloodPreInterval, PageQuery pageQuery) {
		BloodPreIntervalExample example = new BloodPreIntervalExample();
		if(StringUtils.isNotBlank(bloodPreInterval.getInfoId())){
			example.createCriteria().andInfoIdEqualTo(bloodPreInterval.getInfoId());
		}
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return bloodPreIntervalMapper.selectByExample(example);
	}

}
