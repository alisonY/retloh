package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.XueyaInfoMapper;
import com.retloh.model.PageQuery;
import com.retloh.model.XueyaInfo;
import com.retloh.model.XueyaInfoExample;
import com.retloh.service.XueYaInfoServices;

@Service
public class XueYaInfoServicesImpl implements XueYaInfoServices{
	
	@Autowired
	private XueyaInfoMapper xueyainfomapper;

	@Override
	public int insert(XueyaInfo xueyainfo) {
		// TODO Auto-generated method stub
		return xueyainfomapper.insert(xueyainfo);
	}

	@Override
	public int update(XueyaInfo xueyainfo) {
		// TODO Auto-generated method stub
		return xueyainfomapper.updateByPrimaryKey(xueyainfo);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return xueyainfomapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<XueyaInfo> getXueYaInfo(XueyaInfo xueyainfo, PageQuery pageQuery) {
		// TODO Auto-generated method stub
		XueyaInfoExample example = new XueyaInfoExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return xueyainfomapper.selectByExample(example);
	}

	@Override
	public XueyaInfo getXueYaInfoById(String id) {
		// TODO Auto-generated method stub
		return xueyainfomapper.selectByPrimaryKey(id);
	}

}
