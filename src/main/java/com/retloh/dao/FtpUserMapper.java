package com.retloh.dao;

import com.retloh.model.FtpUser;
import com.retloh.model.FtpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FtpUserMapper {
    int countByExample(FtpUserExample example);

    int deleteByExample(FtpUserExample example);

    int deleteByPrimaryKey(String name);

    int insert(FtpUser record);

    int insertSelective(FtpUser record);

    List<FtpUser> selectByExample(FtpUserExample example);

    FtpUser selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") FtpUser record, @Param("example") FtpUserExample example);

    int updateByExample(@Param("record") FtpUser record, @Param("example") FtpUserExample example);

    int updateByPrimaryKeySelective(FtpUser record);

    int updateByPrimaryKey(FtpUser record);
}