package com.retloh.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.CommonExample;
import com.retloh.model.PageQuery;
import com.retloh.model.StatisticsExample;
import com.retloh.model.UserGroup;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CommonServices;
import com.retloh.service.CountInfoServices;
import com.retloh.service.StatisticsServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

	@Autowired
	private StatisticsServices stat_services;
	@Autowired
	private CommonServices commonservices;
	@Autowired
	private CountInfoServices countInfoServices;
	

	@RequestMapping(value = "/toPage", method = { RequestMethod.GET })
	public String toPage(HttpServletRequest request) throws IOException {
		return "/statistics/statistics";
	}

	/**
	 * 统计各个用户的分析或采集量
	 * 
	 * @param request
	 * @return
	 * @throws SQLException
	 */
	@RequestMapping(value = "/getInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String getInfo(HttpServletRequest request,PageQuery pageQuery) throws SQLException {
		List<Map> res = countInfoServices.countByUserId(pageQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map> result=new ArrayList<Map>();
		for(Map res_map:res){
			map.put("userId", res_map.get("userId"));
			//TODO
			map.put("group", "武警一組");
			map.put("role", "管理员");
			int action=(Integer) res_map.get("action");
			if(action==1){
				map.put("collectionNum", res_map.get("count"));
			}else if(action==2){
				map.put("analysisNum", res_map.get("count"));
			}
		}
		result.add(map);
		
		MyPageInfo<Map> resultList = new MyPageInfo<Map>(result);
		String resultJson = JacksonUtils.getInstance().obj2Json(resultList);
		return resultJson;

	}

	/**
	 * 统计某个用户的上传、下载、分析量
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/count", method = { RequestMethod.POST })
	public String countActionByUserName(HttpServletRequest request, String userid) throws IOException {
		// 有问题 TO-DO

		StatisticsExample example = new StatisticsExample();
		// 上传
		example.createCriteria().andUserIdEqualTo(userid).andActionEqualTo(0);
		int uploadnum = stat_services.countByExample(example);
		// 下载
		example.createCriteria().andUserIdEqualTo(userid).andActionEqualTo(1);
		int downloadnum = stat_services.countByExample(example);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uploadnum", uploadnum);
		map.put("downloadnum", downloadnum);

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

	/**
	 * 统计通用表中待分析、待回传、已回传等情况
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/countstatus", method = { RequestMethod.GET })
	@ResponseBody
	public String countStatus(HttpServletRequest request) throws IOException {
		// 有点麻烦凑合吧 count(status) group by status

		Map<Integer, Object> map = new HashMap<Integer, Object>();
		CommonExample commonexample = new CommonExample();
		// 0=待上传数据包，
		commonexample.createCriteria().andStatusEqualTo(0);
		int waitupload = commonservices.countByExample(commonexample);
		map.put(0, waitupload);
		// 1=已上传待分析，
		commonexample.createCriteria().andStatusEqualTo(1);
		int waitanalysis = commonservices.countByExample(commonexample);
		map.put(1, waitanalysis);
		// 2=待分析下载中，
		commonexample.createCriteria().andStatusEqualTo(2);
		int download = commonservices.countByExample(commonexample);
		map.put(2, download);
		// 3=已被下载，
		commonexample.createCriteria().andStatusEqualTo(3);
		int downloaded = commonservices.countByExample(commonexample);
		map.put(3, downloaded);
		// 4=已被分析回传中，
		commonexample.createCriteria().andStatusEqualTo(4);
		int waitreturn = commonservices.countByExample(commonexample);
		map.put(4, waitreturn);
		// 5=已回传报告
		commonexample.createCriteria().andStatusEqualTo(5);
		int returned = commonservices.countByExample(commonexample);
		map.put(5, returned);

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

	/**
	 * 统计某个用户的一段时间内的上传、下载、分析量
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */

	@RequestMapping(value = "/count", method = { RequestMethod.GET })
	public String countActionByDate(HttpServletRequest request, String userid, Date starttime, Date endtime)
			throws IOException {
		StatisticsExample example = new StatisticsExample();
		// 上传
		example.createCriteria().andUserIdEqualTo(userid).andActionEqualTo(0).andOperationTimeBetween(starttime,
				endtime);
		int uploadnum = stat_services.countByExample(example);

		// 下载
		example.createCriteria().andUserIdEqualTo(userid).andActionEqualTo(1).andOperationTimeBetween(starttime,
				endtime);
		int downloadnum = stat_services.countByExample(example);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uploadnum", uploadnum);
		map.put("downloadnum", downloadnum);

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

}
