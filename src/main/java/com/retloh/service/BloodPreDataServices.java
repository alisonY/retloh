package com.retloh.service;

import java.util.List;

import com.retloh.model.BloodPreData;
import com.retloh.model.PageQuery;

/**
 * 血压 表
 *
 */
public interface BloodPreDataServices {

    int deleteByPrimaryKey(String id);

    int insert(BloodPreData record);

    int insertSelective(BloodPreData record);

    BloodPreData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BloodPreData record);

    int updateByPrimaryKey(BloodPreData record);

	List<BloodPreData> getDataList(BloodPreData bloodPreData, PageQuery pageQuery);
}