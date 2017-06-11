package com.retloh.dao;

import com.retloh.model.BloodPreInfo;
import com.retloh.model.BloodPreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodPreInfoMapper {
    int countByExample(BloodPreInfoExample example);

    int deleteByExample(BloodPreInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(BloodPreInfo record);

    int insertSelective(BloodPreInfo record);

    List<BloodPreInfo> selectByExample(BloodPreInfoExample example);

    BloodPreInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BloodPreInfo record, @Param("example") BloodPreInfoExample example);

    int updateByExample(@Param("record") BloodPreInfo record, @Param("example") BloodPreInfoExample example);

    int updateByPrimaryKeySelective(BloodPreInfo record);

    int updateByPrimaryKey(BloodPreInfo record);
}