package com.retloh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.retloh.dao.CaseInfoMapper;
import com.retloh.model.CaseInfo;
import com.retloh.model.CaseInfoExample;
import com.retloh.model.PageQuery;
import com.retloh.service.CaseInfoServices;

@Service
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

	@Override
	public List<CaseInfo> getCaseInfo(CaseInfo caseinfo, PageQuery query) {
		CaseInfoExample example = new CaseInfoExample();
/*		long count = PageHelper.count(new ISelect() {
			@Override
			public void doSelect() {
				caseinfomapper.selectByExample(example);
			}
		});*/
		PageHelper.startPage(query.getPageNum(), query.getPageSize());
		return caseinfomapper.selectByExample(example);
	}

}
