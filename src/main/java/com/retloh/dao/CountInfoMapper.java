package com.retloh.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CountInfoMapper {
	
	List<Map> countByUserId(@Param("collectionName")String collectionName,@Param("analysisName")String analysisName,@Param("startTime")Date startTime,@Param("endTime")Date endTime);

}
