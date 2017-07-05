package com.retloh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.retloh.model.Common;
import com.retloh.model.CommonExample;
import com.retloh.model.PageQuery;

public interface CommonServices {
	
	int deleteByPrimaryKey(String id);

    int insert(Common record);

    int insertSelective(Common record);

    Common selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);

	List<Common> getDataList(Common record, PageQuery pageQuery);

	List<Common> getDataList(Common record, PageQuery pageQuery,HttpServletRequest request);
	
	List<Common> getDataListForClient(Common record, List<String> idsList, PageQuery pageQuery);
	
	String getInfoById(String id);
	
	List<Common> getData();
	
	int countByExample(CommonExample example);

}
