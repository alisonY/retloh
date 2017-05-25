package com.retloh.service;

import com.retloh.model.CaseInfo;

public interface CaseInfoServices {
	
	int insert(CaseInfo caseinfo);
	
    int update(CaseInfo caseinfo);
    
    int delete(String id);

}
