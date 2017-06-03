package com.retloh.controller;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.retloh.model.CaseInfo;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.UserServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/user")
public class TUserController {
	
	@Autowired
	private UserServices userservices;
	private static final Logger LOGGER     = LoggerFactory.getLogger(TUserController.class);
	
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/user/userManagement";
    }
	
	@RequestMapping(value="/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getCaseInfo(HttpServletRequest request,TUser tuser,PageQuery pageQuery) throws IOException {
	    
	    MyPageInfo<TUser> resultList = new MyPageInfo<TUser>(userservices.getUserInfo(tuser, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	@RequestMapping(value="/getJson",method={RequestMethod.GET})
    @ResponseBody
    public String getFirstPage(HttpServletRequest request) {  
    	List <TUser> list = userservices.getAll();
    	String json = JacksonUtils.getInstance().obj2Json(list);
    	LOGGER.info("info");
    	LOGGER.debug("debug");
    	LOGGER.warn("warn");
    	LOGGER.trace("trace");
    	LOGGER.error("error");
        return json;  
    }

	@RequestMapping(value="/listUser")
	public ModelAndView listUser(HttpServletRequest request,ModelMap modelMap) {
	    ModelAndView mav = new ModelAndView();
		List <TUser> list = userservices.getAll();
		modelMap.put("User", list);
		mav.addAllObjects(modelMap);
		mav.setViewName("listUser");
		return mav;
	}

	
    @RequestMapping(value="/addUserPage")
    public ModelAndView addUserPage(TUser user) {
        return new ModelAndView("addUser");
    }
	
	
	@RequestMapping(value="/addUserAction")
	public ModelAndView addUserAction(TUser user) {
		String id = UUID.randomUUID().toString();
		user.setId(id);
		userservices.insert(user);
		return new ModelAndView("redirect:/muser/listUser.do");
	}
	
	
	@RequestMapping(value="/updateUserPage")
	public ModelAndView updateUserUI(String id, HttpServletRequest request,ModelMap modelMap) {
		TUser user = userservices.selectByPrimaryKey(id);
		modelMap.put("user", user);
		ModelAndView mav = new ModelAndView();
		mav.addAllObjects(modelMap);
		mav.setViewName("updateUser");
		return mav;
	}

	@RequestMapping(value="/updateUserAction")
	public String updateUser(TUser user) {
		userservices.update(user);
		return "redirect:/muser/listUser.do";
	}
	
	
   @RequestMapping(value="/deleteUser")
    public ModelAndView deleteUser(String id) {
	   userservices.delete(id);
        return new ModelAndView("redirect:/muser/listUser.do");
    }

}
