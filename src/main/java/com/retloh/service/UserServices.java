package com.retloh.service;

import com.retloh.model.TUser;

public interface UserServices {
	
	TUser getUserInfoBy(String loginName,String password);
	
}
