package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.TUser;

public interface UserServices {

	TUser getUserInfoBy(String loginName, String password);

	TUser selectByPrimaryKey(String id);

	int insert(TUser tuser);

	int update(TUser tuser);
	
	int updateByExample(TUser tuser);

	int delete(String id);
	
	List<TUser> getUserInfo(TUser tuser,PageQuery pageQuery);
	
	int changePassword(TUser tuser);

}
