package com.retloh.dao;

import com.retloh.model.BloodPreData;
import com.retloh.model.BloodPreDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodPreDataMapper {
    int countByExample(BloodPreDataExample example);

    int deleteByExample(BloodPreDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(BloodPreData record);

    int insertSelective(BloodPreData record);

    List<BloodPreData> selectByExample(BloodPreDataExample example);

    BloodPreData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BloodPreData record, @Param("example") BloodPreDataExample example);

    int updateByExample(@Param("record") BloodPreData record, @Param("example") BloodPreDataExample example);

    int updateByPrimaryKeySelective(BloodPreData record);

    int updateByPrimaryKey(BloodPreData record);
}