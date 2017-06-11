package com.retloh.dao;

import com.retloh.model.XueyaInfo;
import com.retloh.model.XueyaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueyaInfoMapper {
    int countByExample(XueyaInfoExample example);

    int deleteByExample(XueyaInfoExample example);

    int deleteByPrimaryKey(String patientId);

    int insert(XueyaInfo record);

    int insertSelective(XueyaInfo record);

    List<XueyaInfo> selectByExample(XueyaInfoExample example);

    XueyaInfo selectByPrimaryKey(String patientId);

    int updateByExampleSelective(@Param("record") XueyaInfo record, @Param("example") XueyaInfoExample example);

    int updateByExample(@Param("record") XueyaInfo record, @Param("example") XueyaInfoExample example);

    int updateByPrimaryKeySelective(XueyaInfo record);

    int updateByPrimaryKey(XueyaInfo record);
}