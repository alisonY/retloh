package com.retloh.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.retloh.model.UserGroup;
import com.retloh.model.UserGroupExample;
import com.retloh.dao.UserGroupMapper;
import com.retloh.model.PageQuery;
import com.retloh.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	private UserGroupMapper UserGroupMapper;
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserGroup record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserGroup record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserGroup selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(UserGroup record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserGroup record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<UserGroup> getGroupInfo(UserGroup record, PageQuery pageQuery) {
		UserGroupExample example = new UserGroupExample();
		example.createCriteria().andIsDeletedEqualTo(0);
		example.setOrderByClause("uptate_time");
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return UserGroupMapper.selectByExample(example);
	}

}
