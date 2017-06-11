package com.retloh.dao;

import com.retloh.model.BloodPreInterval;
import com.retloh.model.BloodPreIntervalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodPreIntervalMapper {
    int countByExample(BloodPreIntervalExample example);

    int deleteByExample(BloodPreIntervalExample example);

    int deleteByPrimaryKey(String id);

    int insert(BloodPreInterval record);

    int insertSelective(BloodPreInterval record);

    List<BloodPreInterval> selectByExample(BloodPreIntervalExample example);

    BloodPreInterval selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BloodPreInterval record, @Param("example") BloodPreIntervalExample example);

    int updateByExample(@Param("record") BloodPreInterval record, @Param("example") BloodPreIntervalExample example);

    int updateByPrimaryKeySelective(BloodPreInterval record);

    int updateByPrimaryKey(BloodPreInterval record);
}