package com.retloh.dao;

import com.retloh.model.Statistics;
import com.retloh.model.StatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    int countByExample(StatisticsExample example);

    int deleteByExample(StatisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    List<Statistics> selectByExample(StatisticsExample example);

    Statistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByPrimaryKeySelective(Statistics record);

    int updateByPrimaryKey(Statistics record);
}