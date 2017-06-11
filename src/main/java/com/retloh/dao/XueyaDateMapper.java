package com.retloh.dao;

import com.retloh.model.XueyaDate;
import com.retloh.model.XueyaDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XueyaDateMapper {
    int countByExample(XueyaDateExample example);

    int deleteByExample(XueyaDateExample example);

    int deleteByPrimaryKey(String patientId);

    int insert(XueyaDate record);

    int insertSelective(XueyaDate record);

    List<XueyaDate> selectByExample(XueyaDateExample example);

    XueyaDate selectByPrimaryKey(String patientId);

    int updateByExampleSelective(@Param("record") XueyaDate record, @Param("example") XueyaDateExample example);

    int updateByExample(@Param("record") XueyaDate record, @Param("example") XueyaDateExample example);

    int updateByPrimaryKeySelective(XueyaDate record);

    int updateByPrimaryKey(XueyaDate record);
}