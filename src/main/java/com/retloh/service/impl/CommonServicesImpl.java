package com.retloh.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
		record.setCreateTime(new Date());
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

	public int updateByPrimaryKeySelective(Common record) {
		// TODO Auto-generated method stub
		return commonmapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Common record) {
		return commonmapper.updateByPrimaryKey(record);
	}

	public List<Common> getDataList(Common record, PageQuery pageQuery) {
		CommonExample example = new CommonExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return commonmapper.selectByExample(example);
	}

	public List<Common> getDataList(Common record, PageQuery pageQuery, HttpServletRequest request) {
		String createTimeStartStr =  request.getParameter("createTimeStart");
		String createTimeEndStr =  request.getParameter("createTimeEnd");
		String updateTimeStartStr =  request.getParameter("updateTimeStart");
		String updateTimeEndStr =  request.getParameter("updateTimeEnd");

		
		CommonExample example = new CommonExample();
		CommonExample.Criteria criteria=example.createCriteria();  
		if(StringUtils.isNotBlank(record.getIdCard())){
			criteria.andIdCardEqualTo(record.getIdCard());
		}
		if(StringUtils.isNotBlank(record.getPatName())){
			criteria.andPatNameLike(record.getPatName());
		}
		if(StringUtils.isNotBlank(record.getPgType())){
			criteria.andPgTypeEqualTo(record.getPgType());
		}
		
		
		Date createTimeStart = null;
		if(StringUtils.isNotBlank(createTimeStartStr)){
			createTimeStart =  DateUtils.stringToDate(createTimeStartStr, DateUtils.DATETIMEPATTERN24H);
		}
		
		Date createTimeEnd = null;
		if(StringUtils.isNotBlank(createTimeEndStr)){
			createTimeEnd =  DateUtils.stringToDate(createTimeEndStr, DateUtils.DATETIMEPATTERN24H);
		}
		
		Date updateTimeStart = null;
		if(StringUtils.isNotBlank(updateTimeStartStr)){
			updateTimeStart =  DateUtils.stringToDate(updateTimeStartStr, DateUtils.DATETIMEPATTERN24H);
		}
		Date updateTimeEnd = null;
		if(StringUtils.isNotBlank(updateTimeEndStr)){
			updateTimeEnd =  DateUtils.stringToDate(updateTimeEndStr, DateUtils.DATETIMEPATTERN24H);
		}
		
		if(createTimeStart!=null && createTimeEnd!=null){
			criteria.andCreateTimeBetween(createTimeStart, createTimeEnd);
		}else if(createTimeStart!=null){
			criteria.andCreateTimeBetween(createTimeStart, new Date());
		}else if(createTimeEnd!=null){
			criteria.andCreateTimeLessThanOrEqualTo(createTimeEnd);
		}
		
		
		if(updateTimeStart!=null && updateTimeEnd!=null){
			criteria.andUpdateTimeBetween(updateTimeStart, updateTimeEnd);
		}else if(updateTimeStart!=null){
			criteria.andUpdateTimeBetween(updateTimeStart, new Date());
		}else if(updateTimeEnd!=null){
			criteria.andUpdateTimeLessThanOrEqualTo(updateTimeEnd);
		}
		example.setOrderByClause("create_time DESC");
		
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return commonmapper.selectByExample(example);
	}	
	
	
	public String getInfoById(String id) {
		return commonmapper.selectByPrimaryKey(id).getInfo();
	}

	public List<Common> getDataListForClient(Common record,List<String> idsList,PageQuery pageQuery) {
		CommonExample example = new CommonExample();
		CommonExample.Criteria criteria = example.createCriteria();
		criteria.andPgTypeEqualTo(record.getPgType());
		if(StringUtils.isNotBlank(record.getUpId())){
			criteria.andUpIdEqualTo(record.getUpId());
		}
		if(StringUtils.isNotBlank(record.getGroupId())){
			criteria.andGroupIdEqualTo(record.getGroupId());
		}
		if(record.getStatus()!=null){
			criteria.andStatusEqualTo(record.getStatus());
		}
		if(idsList.size()>0){
			criteria.andIdIn(idsList);
		}
		if(pageQuery.getPage() == null){
			pageQuery.setPage(1);
		}
		if(pageQuery.getRows() == null){
			pageQuery.setRows(20);
		}
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return commonmapper.selectByExample(example);
	}

	public List<Common> getData() {
		CommonExample example = new CommonExample();
		example.createCriteria().andStatusEqualTo(3).andDownTimeNotBetween(new Date(), DateUtils.getDateBefore(2));
		return commonmapper.selectByExample(example);
	}

	public int countByExample(CommonExample example) {
		return commonmapper.countByExample(example);
	}


	public List<Common> getpatInfoForDownload(Common record) {
		CommonExample example = new CommonExample();
		CommonExample.Criteria criteria=example.createCriteria();  
		if(StringUtils.isNotBlank(record.getPatNo())){
			criteria.andPatNoEqualTo(record.getPatNo());
		}
		if(StringUtils.isNotBlank(record.getIdCard())){
			criteria.andIdCardEqualTo(record.getIdCard());
		}
		if(StringUtils.isNotBlank(record.getSocialId())){
			criteria.andSocialIdEqualTo(record.getSocialId());
		}
		if(StringUtils.isNotBlank(record.getPatName())){
			criteria.andPatNameEqualTo(record.getPatName());
		}
		example.setOrderByClause("create_time DESC");
		return commonmapper.selectByExample(example);
	}

}
