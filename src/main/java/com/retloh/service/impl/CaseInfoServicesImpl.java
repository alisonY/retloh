package com.retloh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.retloh.dao.CaseInfoMapper;
import com.retloh.model.CaseInfo;
import com.retloh.service.CaseInfoServices;

public class CaseInfoServicesImpl implements CaseInfoServices{
	
	@Autowired
	private CaseInfoMapper caseinfomapper;

	@Override
	public int insert(CaseInfo caseinfo) {
		// TODO Auto-generated method stub
		return caseinfomapper.insert(caseinfo);
	}

	@Override
	public int update(CaseInfo caseinfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
