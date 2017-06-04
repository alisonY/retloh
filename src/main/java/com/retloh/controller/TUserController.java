package com.retloh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.ftpserver.ftplet.FtpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.retloh.model.FtpUser;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.UserServices;
import com.retloh.service.impl.FtpServerUserManagerImpl;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/user")
public class TUserController {
	
	@Autowired
	private UserServices userservices;
	@Autowired
	private FtpServerUserManagerImpl ftpserver;
	
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
	
	
    /**
	 * USED
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/addUserAction",method={RequestMethod.POST})
	@ResponseBody
	public String addUserAction(HttpServletRequest request,TUser user) {
		Map<String,Object> map = new HashMap<String, Object>();
		String id = UUID.randomUUID().toString();
		user.setId(id);
		int result  = 0 ;
		result = userservices.insert(user);
		
		FtpUser ftpuser = new FtpUser();
		ftpuser.setName(user.getUserName());
		ftpuser.setEnabled(true);
		ftpuser.setHomedirectory("/data");
		ftpuser.setPassword(user.getPassword());
		ftpuser.setWritepermission(true);
		ftpuser.setIdletime(0);
		ftpuser.setUploadrate(1000);
		ftpuser.setDownloadrate(1000);
		ftpuser.setMaxloginnumber(100);
		ftpuser.setMaxloginperip(100);
		
		try {
			ftpserver.save(ftpuser);
		} catch (FtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result>0){
			map.put("msg","添加成功");
		}else{
			map.put("msg","添加失败");
		}
		
		map.put("status",result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
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
	
	
	/**
	 * USED
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/deleteUser",method={RequestMethod.POST})
	@ResponseBody
    public String deleteUser(String id) {
		Map<String,Object> map = new HashMap<String, Object>();
		int result = 0;
		if(StringUtils.isNotBlank(id)){
			result = userservices.delete(id);
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

}
