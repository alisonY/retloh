package com.retloh.dao;

import com.retloh.model.CaseInfo;
import com.retloh.model.CaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseInfoMapper {
    int countByExample(CaseInfoExample example);

    int deleteByExample(CaseInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(CaseInfo record);

    int insertSelective(CaseInfo record);

    List<CaseInfo> selectByExample(CaseInfoExample example);

    CaseInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CaseInfo record, @Param("example") CaseInfoExample example);

    int updateByExample(@Param("record") CaseInfo record, @Param("example") CaseInfoExample example);

    int updateByPrimaryKeySelective(CaseInfo record);

    int updateByPrimaryKey(CaseInfo record);
}