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
	public List<Statistics> getData(Statistics statistics) {
		// TODO Auto-generated method stub
		StatisticsExample example = new StatisticsExample();
		example.createCriteria().andActionEqualTo(4);
		return null;
	}
	
	/**
	 * 获取day天前的日期
	 * @param day
	 * @return
	 */
	public String getDateBefore(int day) {
		Date date=new Date();
        Calendar now = Calendar.getInstance();  
        now.setTime(date);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(now.getTime());
    }
	
	public static void main(String[] args) {
		StatisticsServicesImpl ssi=new StatisticsServicesImpl();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now=sdf.format(new Date());
        String before=ssi.getDateBefore(1);
        System.out.println(now);
		System.out.println(before);
		System.out.println(before);
		
	}

}
