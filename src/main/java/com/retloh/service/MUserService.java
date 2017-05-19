package com.retloh.service;


import java.util.List;

import com.retloh.model.MUser;

public interface MUserService {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
}
