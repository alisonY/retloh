package com.retloh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CommonServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;


@Controller
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
    private CommonServices commonServices;
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(CommonController.class);
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/common/common";
    }
	
	@RequestMapping(value="/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getCaseInfo(HttpServletRequest request,Common common,PageQuery pageQuery) throws IOException {
	    MyPageInfo<Common> resultList = new MyPageInfo<Common>(commonServices.getDataList(common, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	@RequestMapping(value="/viewInfo",method={RequestMethod.POST})
    @ResponseBody
    public String viewInfo(HttpServletRequest request,String id){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("status",false);
		if(StringUtils.isNotBlank(id)){
			String info = commonServices.getInfoById(id);
			if(info!=null){
				String[] fields = info.split("#");
				map.put("status",true);
				map.put("msg", fields);
			}else{
				map.put("msg", "查无此结果");
			}
		}else{
			map.put("msg","操作失败，请重试_"+id);
		}
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
	

}
