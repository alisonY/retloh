package com.retloh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.Statistics;
import com.retloh.model.StatisticsExample;
import com.retloh.service.CommonServices;
import com.retloh.service.StatisticsServices;
import com.retloh.utils.JacksonMapper;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {
	
	@Autowired
	private StatisticsServices stat_services; 
	@Autowired
	private CommonServices commonservices;
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/statistics/statistics";
    }
	
	/**
	 *  统计某个用户的上传、下载、分析量 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	
	@RequestMapping(value="/count",method={RequestMethod.POST})
    public String countActionByUserName(HttpServletRequest request,String userid) throws IOException {
		StatisticsExample example =new StatisticsExample();
		example.createCriteria().andUserIdEqualTo(userid);
 		List<Statistics> list_stat=stat_services.selectByExample(example);
 		
 		Map<String, Object> map = new HashMap<String, Object>();
 		
 		for(Statistics statistics:list_stat){
 			
 		}
		
 		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
	/**
	 *  统计通用表中待分析、待回传、已回传等情况
	 * @param request
	 * @return
	 * @throws IOException
	 */
	
	@RequestMapping(value="/countstatus",method={RequestMethod.GET})
	@ResponseBody
    public String countStatus(HttpServletRequest request) throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		
    	return "/statistics/statistics";
    }
	
	/**
	 *  统计某个用户的一段时间内的上传、下载、分析量
	 * @param request
	 * @return
	 * @throws IOException
	 */
	
	@RequestMapping(value="/count",method={RequestMethod.GET})
    public String countActionByDate(HttpServletRequest request) throws IOException {
    	return "/statistics/statistics";
    }

}
