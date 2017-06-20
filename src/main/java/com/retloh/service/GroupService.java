package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.UserGroup;

public interface GroupService {

    int deleteByPrimaryKey(String id);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
    
    List<UserGroup> getGroupInfo(UserGroup record,PageQuery pageQuery);
}