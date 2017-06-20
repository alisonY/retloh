package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.retloh.dao.GroupMapper;
import com.retloh.model.Group;
import com.retloh.model.GroupExample;
import com.retloh.model.PageQuery;
import com.retloh.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	private GroupMapper groupMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Group record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Group record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Group selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Group record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Group record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Group> getGroupInfo(Group record, PageQuery pageQuery) {
		GroupExample example = new GroupExample();
		example.createCriteria().andIsDeletedEqualTo(0);
		PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
		return groupMapper.selectByExample(example);
	}

}
