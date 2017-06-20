package com.retloh.service;

import java.util.List;

import com.retloh.model.Group;
import com.retloh.model.PageQuery;

public interface GroupService {

    int deleteByPrimaryKey(String id);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
    
    List<Group> getGroupInfo(Group record,PageQuery pageQuery);
}