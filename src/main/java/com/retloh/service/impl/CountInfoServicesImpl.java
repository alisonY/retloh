package com.retloh.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.CountInfoMapper;
import com.retloh.model.PageQuery;
import com.retloh.service.CountInfoServices;

@Service
public class CountInfoServicesImpl implements CountInfoServices{

	@Autowired
	private CountInfoMapper countInfoMapper;
	
	@Override
	public List<Map> countByUserId(PageQuery pageQuery) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return countInfoMapper.countByUserId();
	}
	

}
