package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.XueyaDataMapper;
import com.retloh.model.PageQuery;
import com.retloh.model.XueyaData;
import com.retloh.model.XueyaDataExample;
import com.retloh.service.XueYaDataServices;

@Service
public class XueYaDataServicesImpl implements XueYaDataServices{
	
	@Autowired
	private XueyaDataMapper xueyadatamapper;

	@Override
	public int insert(XueyaData xueyadata) {
		// TODO Auto-generated method stub
		return xueyadatamapper.insert(xueyadata);
	}

	@Override
	public int update(XueyaData xueyadata) {
		// TODO Auto-generated method stub
		return xueyadatamapper.updateByPrimaryKey(xueyadata);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return xueyadatamapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<XueyaData> getXueYaData(XueyaData xueyadata, PageQuery pageQuery) {
		// TODO Auto-generated method stub
		XueyaDataExample example = new XueyaDataExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return xueyadatamapper.selectByExample(example);
	}

	@Override
	public XueyaData getXueYaDataById(String id) {
		// TODO Auto-generated method stub
		return xueyadatamapper.selectByPrimaryKey(id);
	}

}
