package com.retloh.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.framework.context.UserContextHolder;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.model.UserGroup;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.GroupService;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;


@Controller
@RequestMapping("/group")
public class GroupController {
	
	//private static final Logger LOGGER     = LoggerFactory.getLogger(GroupController.class);
	
	@Autowired
    private GroupService groupService;
	
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/group/groupList";
    }
	
	
	@RequestMapping(value="/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getGroupInfo(HttpServletRequest request,UserGroup record,PageQuery pageQuery) throws IOException {
	    MyPageInfo<UserGroup> resultList = new MyPageInfo<UserGroup>(groupService.getGroupInfo(record, pageQuery));;
	    String resultJson = JacksonUtils.getInstance().obj2Json(resultList);
    	return resultJson;
    }
	
	@RequestMapping(value="/delGroup",method={RequestMethod.POST})
    @ResponseBody
    public String delGroup(HttpServletRequest request,String id){
		Map<String,Object> map = new HashMap<String, Object>();
		int result = 0;
		if(StringUtils.isNotBlank(id)){
			UserGroup userGroup = new UserGroup();
			userGroup.setId(id);
			userGroup.setIsDeleted(1);
			result = groupService.updateByPrimaryKeySelective(userGroup);
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
	
	
	@RequestMapping(value="/groupOpt",method={RequestMethod.POST})
    @ResponseBody
    public String groupOpt(HttpServletRequest request,String id,String dec){
		Map<String,Object> map = new HashMap<String, Object>();
		int result = 0;
		if(StringUtils.isNotBlank(dec)){
			TUser user = UserContextHolder.getUserInfoVo();
			UserGroup userGroup = new UserGroup();
			if(user!=null){
				userGroup.setOperator(user.getLoginName());
				userGroup.setOperatorId(user.getId());
			}
			
			userGroup.setDescription(dec);
			userGroup.setUptateTime(new Date());
			userGroup.setIsDeleted(0);
			if(StringUtils.isNotBlank(id)){
				//UPDATE
				userGroup.setId(id);
				result = groupService.updateByPrimaryKeySelective(userGroup);
			}else{
				//ADD
				userGroup.setId(UUID.randomUUID().toString());
				userGroup.setCreateTime(new Date());
				result = groupService.insert(userGroup);
			}
			if(result>0){
				map.put("msg","操作成功");
			}else{
				map.put("msg","操作失败");
			}
		}else{
			map.put("msg","操作失败，请重试_"+id);
		}
		map.put("status",result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
    }
	
}