package com.retloh.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.TUserMapper;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.PageQuery;
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

	@Override
	public TUser selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return tUserMapper.selectByPrimaryKey(id);
	}

	public int insert(TUser tuser) {
		return tUserMapper.insert(tuser);
	}

	@Override
	public int update(TUser tuser) {
		// TODO Auto-generated method stub
		return tUserMapper.updateByPrimaryKey(tuser);
	}

	public int delete(String id) {
		return tUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<TUser> getUserInfo(TUser tuser, PageQuery pageQuery) {
		// TODO Auto-generated method stub
		TUserExample userexample =new TUserExample();
		userexample.setOrderByClause("create_time DESC");
		
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		
		return tUserMapper.selectByExample(userexample);
	}

	@Override
	public int updateByExample(TUser tUser) {
		TUserExample userexample =new TUserExample();
		userexample.createCriteria().andIdEqualTo(tUser.getId());
		return tUserMapper.updateByExampleSelective(tUser, userexample);
	}

	public int changePassword(TUser muser) {
		return tUserMapper.updateByPrimaryKeySelective(muser);
	}

}
