package com.retloh.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

import com.retloh.framework.context.UserContextHolder;
import com.retloh.model.FtpUser;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.model.UserGroup;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.GroupService;
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
	@Autowired
	private GroupService groupService;

	private static final Logger LOGGER = LoggerFactory.getLogger(TUserController.class);

	@RequestMapping(value = "/toPage", method = { RequestMethod.GET })
	public String toPage(HttpServletRequest request) throws IOException {
		return "/user/userManagement";
	}

	@RequestMapping(value = "/getInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String getCaseInfo(HttpServletRequest request, TUser tuser, PageQuery pageQuery) throws IOException {
		MyPageInfo<TUser> resultList = new MyPageInfo<TUser>(userservices.getUserInfo(tuser, pageQuery));
		String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
		return resultJson2;
	}

	@RequestMapping(value = "/addUserPage")
	public ModelAndView addUserPage(TUser user) {
		return new ModelAndView("addUser");
	}

	/**
	 * USED
	 */
	public String addUserAction(HttpServletRequest request, TUser user) {
		Map<String, Object> map = new HashMap<String, Object>();
		TUser  tUser = UserContextHolder.getUserInfoVo();
		if(tUser == null ){
			map.put("msg", "添加失败");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		
		if(StringUtils.isBlank(user.getGroupId())){
			map.put("msg", "添加失败用户组未选择");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		if(user.getUserRank() == null){
			map.put("msg", "失败，可登陆端未选择");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		if(user.getUserType() == null){
			map.put("msg", "失败，账号类型未选择");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		
		UserGroup userGroup = groupService.selectByPrimaryKey(user.getGroupId());
		if(userGroup == null){
			map.put("msg", "失败，不存在所选分组");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		userGroup.getDescription();
		
		String id = UUID.randomUUID().toString();
		user.setId(id);
		user.setOperator(tUser.getLoginName());
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		user.setGroupDesc(userGroup.getDescription());
		
		int result = 0;
		result = userservices.insert(user);
		
		FtpUser ftpuser = new FtpUser();
		ftpuser.setId(user.getId());
		ftpuser.setName(user.getLoginName());
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

		if (result > 0) {
			map.put("msg", "添加成功");
		} else {
			map.put("msg", "添加失败");
		}

		map.put("status", result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

	
	/**
	 * USED
	 */
	public String updateUser(HttpServletRequest request,TUser user) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		FtpUser ftpuser =ftpserver.selectByPrimaryKey(user.getId());
		ftpuser.setName(user.getLoginName());
		ftpuser.setPassword(user.getPassword());
		ftpserver.updateByPrimaryKey(ftpuser);
		
		
		UserGroup userGroup = groupService.selectByPrimaryKey(user.getGroupId());
		if(userGroup == null){
			map.put("msg", "失败，不存在所选分组");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		
		user.setUpdateTime(new Date());
		user.setGroupDesc(userGroup.getDescription());
		
		int result=userservices.updateByExample(user);
		if (result > 0) {
			map.put("msg", "更新成功");
		} else {
			map.put("msg", "更新失败");
		}

		map.put("status", result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

	/**
	 * USED
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteUser", method = { RequestMethod.POST })
	@ResponseBody
	public String deleteUser(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		int result = 0;
		try {
			//ftpserver.delete(userservices.selectByPrimaryKey(id).getUserName());
			ftpserver.delete(id);
		} catch (FtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (StringUtils.isNotBlank(id)) {
			result = userservices.delete(id);
			if (result > 0) {
				map.put("msg", "删除成功");
			} else {
				map.put("msg", "删除失败");
			}
		} else {
			map.put("msg", "操作失败，请重试_" + id);
		}
		map.put("status", result);
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}
	
	
	
	/**
	 * USED
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getUserInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String getUserInfo(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		if(StringUtils.isNotBlank(id)){
			TUser tUser =userservices.selectByPrimaryKey(id);
			if(tUser!=null){
				map.put("status", true);
				map.put("msg", JacksonUtils.getInstance().obj2Json(tUser));
			}else{
				map.put("msg", "无此用户");
			}
		}else{
			map.put("msg", "参数异常");
		}
		return JacksonUtils.getInstance().obj2Json(map);
	}
	
	
	@RequestMapping(value = "/allGroup", method = { RequestMethod.POST })
	@ResponseBody
	public String allGroup() {
		List<UserGroup> groupList = groupService.getAllGroupInfo();
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();

		for(UserGroup temp : groupList){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", temp.getId());
			map.put("text", temp.getDescription());
			mapList.add(map);
		}
		String resultJson = JacksonUtils.getInstance().obj2Json(mapList);
		return resultJson;
	}
	
	
	@RequestMapping(value = "/userInfoOpt", method = { RequestMethod.POST })
	@ResponseBody
	public String userInfoOpt(HttpServletRequest request,TUser user) {
		if(StringUtils.isBlank(user.getId())){//INSERT
			return addUserAction(request, user);
		}else{//UPDATE
			return updateUser(request, user);
		}
	}
	
	
}
