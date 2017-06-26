package com.retloh.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.CommonMapper;
import com.retloh.model.Common;
import com.retloh.model.CommonExample;
import com.retloh.model.PageQuery;
import com.retloh.service.CommonServices;
import com.retloh.utils.DateUtils;

@Service
public class CommonServicesImpl implements CommonServices {
	@Autowired
	private CommonMapper commonmapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return commonmapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Common record) {
		// TODO Auto-generated method stub
		return commonmapper.insert(record);
	}

	@Override
	public int insertSelective(Common record) {
		// TODO Auto-generated method stub
		return commonmapper.insertSelective(record);
	}

	@Override
	public Common selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return commonmapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Common record) {
		// TODO Auto-generated method stub
		return commonmapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Common record) {
		// TODO Auto-generated method stub
		return commonmapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Common> getDataList(Common record, PageQuery pageQuery) {
		CommonExample example = new CommonExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return commonmapper.selectByExample(example);
	}

	@Override
	public String getInfoById(String id) {
		// TODO Auto-generated method stub
		return commonmapper.selectByPrimaryKey(id).getInfo();
	}

	@Override
	public List<Common> getDataListForClient(Common record, PageQuery pageQuery) {
		CommonExample example = new CommonExample();
		example.createCriteria().andPgTypeEqualTo(record.getPgType());
		if(StringUtils.isNotBlank(record.getUpId())){
			example.createCriteria().andUpIdEqualTo(record.getUpId());
		}
		if(StringUtils.isNotBlank(record.getGroupId())){
			example.createCriteria().andGroupIdEqualTo(record.getGroupId());
		}
		if(record.getStatus()!=null){
			example.createCriteria().andStatusEqualTo(record.getStatus());
		}
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return commonmapper.selectByExample(example);
	}

	@Override
	public List<Common> getData() {
		CommonExample example = new CommonExample();
		example.createCriteria().andStatusEqualTo(3).andDownTimeNotBetween(new Date(), DateUtils.getDateBefore(2));
		return commonmapper.selectByExample(example);
	}

}
