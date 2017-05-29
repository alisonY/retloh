package com.retloh.service;

import java.util.List;

import com.retloh.model.CaseInfo;
import com.retloh.model.PageQuery;

public interface CaseInfoServices {
	
	int insert(CaseInfo caseinfo);
	
    int update(CaseInfo caseinfo);
    
    int delete(String id);
    
    List<CaseInfo> getCaseInfo(CaseInfo caseinfo,PageQuery pageQuery);

}
