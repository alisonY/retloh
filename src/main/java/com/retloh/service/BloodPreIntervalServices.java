package com.retloh.service;

import java.util.List;

import com.retloh.model.BloodPreInterval;
import com.retloh.model.PageQuery;

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

    List<BloodPreInterval> getIntervalList(BloodPreInterval bloodPreInterval, PageQuery pageQuery);
}