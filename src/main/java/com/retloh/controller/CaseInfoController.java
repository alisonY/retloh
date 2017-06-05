package com.retloh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.retloh.model.CaseInfo;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CaseInfoServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;


@Controller
@RequestMapping("/case")
public class CaseInfoController {
	
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(CaseInfoController.class);
	/*
	 * 病例信息入库
	 */
	
	@Autowired
    private CaseInfoServices caseInfoServices;
	
	@RequestMapping(value="/postcase",method={RequestMethod.POST})
    @ResponseBody
    public String postCase(HttpServletRequest request) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line);
        }
        String jsonstr = sb.toString();
        
		ObjectMapper mapper = new ObjectMapper();
	    CaseInfo caseinfo = mapper.readValue(jsonstr, CaseInfo.class);
	    caseInfoServices.insert(caseinfo);
    	return "ok";
    }
	
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/case/caseList";
    }
	
	
	@RequestMapping(value="/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getCaseInfo(HttpServletRequest request,CaseInfo caseinfo,PageQuery pageQuery) throws IOException {
	    //pageinfo用法 http://pageswww.cnblogs.com/digdeep/p/4608933.html
	    MyPageInfo<CaseInfo> resultList = new MyPageInfo<CaseInfo>(caseInfoServices.getCaseInfo(caseinfo, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	
	@RequestMapping(value="/delInfo",method={RequestMethod.POST})
    @ResponseBody
    public String delInfo(HttpServletRequest request,String id){
		Map<String,Object> map = new HashMap<String, Object>();
		int result = 0;
		if(StringUtils.isNotBlank(id)){
			result = caseInfoServices.delete(id);
			if(result>0){
				map.put("msg","删除成功");
			}else{
				map.put("msg","删除失败");
			}
		}else{
			map.put("msg","操作失败，请重试_"+id);
		}
		map.put("status",result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
	
	@RequestMapping(value="/viewInfo",method={RequestMethod.POST})
    @ResponseBody
    public String viewInfo(HttpServletRequest request,String id){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("status",false);
		if(StringUtils.isNotBlank(id)){
			CaseInfo caseInfo = caseInfoServices.getCaseInfoById(id);
			if(caseInfo!=null){
				map.put("status",true);
				map.put("msg", caseInfo);
			}else{
				map.put("msg", "查无此结果");
			}
		}else{
			map.put("msg","操作失败，请重试_"+id);
		}
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
	
	@RequestMapping(value="/editInfo",method={RequestMethod.POST})
    @ResponseBody
    public String editInfo(HttpServletRequest request,CaseInfo caseinfo){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("status",false);
		int result = 0;
		if(StringUtils.isNotBlank(caseinfo.getId())){
			try {
				result = caseInfoServices.update(caseinfo);
			} catch (Exception e) {
				map.put("msg", "修改内容不合法");
				String resultJson = JacksonMapper.beanToJson(map);
				return resultJson;
			}
			if(result>0){
				map.put("status",true);
				map.put("msg", "修改成功");
			}else{
				map.put("msg", "修改失败");
			}
		}else{
			map.put("msg","修改失败，请重试");
		}
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
}
