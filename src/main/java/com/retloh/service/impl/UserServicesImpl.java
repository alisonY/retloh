package com.retloh.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retloh.dao.TUserMapper;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.TUser;
import com.retloh.model.TUserExample;
import com.retloh.service.UserServices;
import com.retloh.utils.JacksonMapper;

@Service
public class UserServicesImpl implements UserServices {

    private static final Logger LOGGER     = LoggerFactory.getLogger(UserServicesImpl.class);

	@Autowired
	private TUserMapper tUserMapper;
	
	public TUser getUserInfoBy(String loginName, String password) {
		TUserExample example = new TUserExample();
		example.createCriteria().andLoginNameEqualTo(loginName).andPasswordEqualTo(password);
		List<TUser> resultList = tUserMapper.selectByExample(example);
		if(resultList != null && resultList.size()>0){
			return resultList.get(0);
		}else{
			return null;
		}
	}

}
