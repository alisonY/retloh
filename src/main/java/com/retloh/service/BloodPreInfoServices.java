package com.retloh.service;

import java.util.List;
import com.retloh.model.BloodPreInfo;
import com.retloh.model.PageQuery;

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
    
    List<BloodPreInfo> getInfoList(BloodPreInfo bloodPreInfo,PageQuery pageQuery);
}