package com.retloh.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.retloh.model.PageQuery;
import com.retloh.model.UserGroup;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.GroupService;
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
	
}