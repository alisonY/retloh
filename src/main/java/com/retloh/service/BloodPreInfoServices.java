package com.retloh.service;

import com.retloh.model.BloodPreInfo;


/**
 * 血压 病人信息表
 *
 */
public interface BloodPreInfoServices {


    int deleteByPrimaryKey(String id);

    int insert(BloodPreInfo record);

    int insertSelective(BloodPreInfo record);

    BloodPreInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BloodPreInfo record);

    int updateByPrimaryKey(BloodPreInfo record);
}