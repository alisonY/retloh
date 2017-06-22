package com.retloh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.CaseInfo;
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
	
	
	@RequestMapping(value="/postcaseT",method={RequestMethod.POST})
    @ResponseBody
    public String postcaseT(HttpServletRequest request,String commonJson){
		
		String line = null;
		StringBuilder sb = new StringBuilder();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("status", false);

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
			while((line = br.readLine())!=null){
			    sb.append(line);
			}
		} catch (IOException e1) {
			map.put("msg", "json转换异常");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
        String jsonstr = sb.toString();
        
        if(StringUtils.isBlank(commonJson) || StringUtils.isNotBlank(commonJson)){
        	commonJson = jsonstr;
        }
        
		LOGGER.error("receive json:"+commonJson);

		if(StringUtils.isNotBlank(commonJson)){
			Common info = new Common();
			try {
				info = JacksonMapper.jsonToBean(commonJson, Common.class);
				if(info!=null){
					info.setId(UUID.randomUUID().toString());
					int flag = commonServices.insert(info);
					if(flag>0){
						map.put("status", true);
						String resultJson = JacksonMapper.beanToJson(map);
						return resultJson; 
					}else{
						map.put("msg", "写库失败");
						String resultJson = JacksonMapper.beanToJson(map);
						return resultJson; 
					}
				}else{
					map.put("msg", "参数异常");
					String resultJson = JacksonMapper.beanToJson(map);
					return resultJson;
				}
			} catch (Exception e) {
				map.put("msg", "json转换异常");
				String resultJson = JacksonMapper.beanToJson(map);
				return resultJson;
			}
		}else{
			map.put("msg", "json为空");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
    }
	
	
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
