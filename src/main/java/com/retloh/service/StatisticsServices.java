package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.Statistics;
import com.retloh.model.StatisticsExample;

public interface StatisticsServices {

	int deleteByPrimaryKey(String id);

	int insert(Statistics statistics);

	int insertSelective(Statistics statistics);

	Statistics selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Statistics statistics);

	int updateByPrimaryKey(Statistics statistics);

	List<Statistics> getDataList(Statistics statistics, PageQuery pageQuery);

	List<Statistics> getData();

	List<Statistics> selectByExample(StatisticsExample example);

	int countByExample(StatisticsExample example);

}
