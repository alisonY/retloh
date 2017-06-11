package com.retloh.service;

import com.retloh.model.BloodPreData;

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
}