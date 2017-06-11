package com.retloh.service;

import com.retloh.model.BloodPreInterval;

/**
 * #血压 测量区间
 *
 */
public interface BloodPreIntervalServices {


    int deleteByPrimaryKey(String id);

    int insert(BloodPreInterval record);

    int insertSelective(BloodPreInterval record);

    BloodPreInterval selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BloodPreInterval record);

    int updateByPrimaryKey(BloodPreInterval record);
}