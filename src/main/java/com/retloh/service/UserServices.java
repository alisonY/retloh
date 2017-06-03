package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.TUser;

public interface UserServices {

	TUser getUserInfoBy(String loginName, String password);

	List<TUser> getAll();

	TUser selectByPrimaryKey(String id);

	int insert(TUser muser);

	int update(TUser muser);

	int delete(String id);
	
	List<TUser> getUserInfo(TUser tuser,PageQuery pageQuery);

}
