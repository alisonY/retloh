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

	public int update(CaseInfo caseinfo) {
		return caseinfomapper.updateByPrimaryKey(caseinfo);
	}

	public int delete(String id) {
		return caseinfomapper.deleteByPrimaryKey(id);
	}

	public List<CaseInfo> getCaseInfo(CaseInfo caseinfo, PageQuery query) {
		CaseInfoExample example = new CaseInfoExample();
		example.setOrderByClause("create_time DESC");
/*		long count = PageHelper.count(new ISelect() {
			@Override
			public void doSelect() {
				caseinfomapper.selectByExample(example);
			}
		});*/
		PageHelper.startPage(query.getPage(), query.getRows());
		return caseinfomapper.selectByExample(example);
	}

	public CaseInfo getCaseInfoById(String id) {
		return caseinfomapper.selectByPrimaryKey(id);
	}

}
