package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.XueyaDateMapper;
import com.retloh.model.PageQuery;
import com.retloh.model.XueyaDate;
import com.retloh.model.XueyaDateExample;
import com.retloh.service.XueYaDateServices;

@Service
public class XueYaDateServicesImpl implements XueYaDateServices{
	
	@Autowired
	private XueyaDateMapper xueyadatemapper;

	@Override
	public int insert(XueyaDate xueyadate) {
		// TODO Auto-generated method stub
		return xueyadatemapper.insert(xueyadate);
	}

	@Override
	public int update(XueyaDate xueyadate) {
		// TODO Auto-generated method stub
		return xueyadatemapper.updateByPrimaryKey(xueyadate);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return xueyadatemapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<XueyaDate> getXueYaDate(XueyaDate xueyadate, PageQuery pageQuery) {
		// TODO Auto-generated method stub
		XueyaDateExample example = new XueyaDateExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return xueyadatemapper.selectByExample(example);
	}

	@Override
	public XueyaDate getXueYaDateById(String id) {
		// TODO Auto-generated method stub
		return xueyadatemapper.selectByPrimaryKey(id);
	}

}
