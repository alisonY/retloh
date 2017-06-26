package com.retloh.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.StatisticsMapper;
import com.retloh.model.PageQuery;
import com.retloh.model.Statistics;
import com.retloh.model.StatisticsExample;
import com.retloh.service.StatisticsServices;
import com.retloh.utils.DateUtils;


@Service
public class StatisticsServicesImpl implements StatisticsServices{

	@Autowired
	private StatisticsMapper statisticsMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return statisticsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Statistics statistics) {
		// TODO Auto-generated method stub
		return statisticsMapper.insert(statistics);
	}

	@Override
	public int insertSelective(Statistics statistics) {
		// TODO Auto-generated method stub
		return statisticsMapper.insertSelective(statistics);
	}

	@Override
	public Statistics selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return statisticsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Statistics statistics) {
		// TODO Auto-generated method stub
		return statisticsMapper.updateByPrimaryKey(statistics);
	}

	@Override
	public int updateByPrimaryKey(Statistics statistics) {
		// TODO Auto-generated method stub
		return statisticsMapper.updateByPrimaryKey(statistics);
	}

	@Override
	public List<Statistics> getDataList(Statistics statistics, PageQuery pageQuery) {

		StatisticsExample example = new StatisticsExample();
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return statisticsMapper.selectByExample(example);
	
	}

	@Override
	public List<Statistics> getData() {
		// TODO Auto-generated method stub
		StatisticsExample example = new StatisticsExample();
		example.createCriteria().andActionEqualTo(4).andOperationTimeNotBetween(new Date(), DateUtils.getDateBefore(2));
		return statisticsMapper.selectByExample(example);
	}

}
