package com.retloh.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.CountInfoMapper;
import com.retloh.dao.TUserMapper;
import com.retloh.model.PageQuery;
import com.retloh.service.CountInfoServices;
import com.retloh.utils.DateUtils;

@Service
public class CountInfoServicesImpl implements CountInfoServices{

	@Autowired
	private CountInfoMapper countInfoMapper;
	@Autowired
	private TUserMapper usermapper;
	
	@Override
	public List<Map> countByUserId(HttpServletRequest request,PageQuery pageQuery) {
		// TODO Auto-generated method stub
		String collectionName =  request.getParameter("collectionName");
		String analysisName =  request.getParameter("analysisName");
		
		String startTimeStr =  request.getParameter("createTimeStart");
		String endTimeStr =  request.getParameter("createTimeEnd");

		Date startTime =  DateUtils.stringToDate(startTimeStr, DateUtils.DATETIMEPATTERN24H);
		Date endTime=  DateUtils.stringToDate(endTimeStr, DateUtils.DATETIMEPATTERN24H);
		
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return countInfoMapper.countByUserId(collectionName,analysisName,startTime,endTime);
	}
	

}
