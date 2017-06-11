package com.retloh.dao;

import com.retloh.model.XueyaData;
import com.retloh.model.XueyaDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueyaDataMapper {
    int countByExample(XueyaDataExample example);

    int deleteByExample(XueyaDataExample example);

    int deleteByPrimaryKey(String patientId);

    int insert(XueyaData record);

    int insertSelective(XueyaData record);

    List<XueyaData> selectByExample(XueyaDataExample example);

    XueyaData selectByPrimaryKey(String patientId);

    int updateByExampleSelective(@Param("record") XueyaData record, @Param("example") XueyaDataExample example);

    int updateByExample(@Param("record") XueyaData record, @Param("example") XueyaDataExample example);

    int updateByPrimaryKeySelective(XueyaData record);

    int updateByPrimaryKey(XueyaData record);
}