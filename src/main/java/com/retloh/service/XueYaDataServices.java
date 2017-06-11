package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.XueyaData;

public interface  XueYaDataServices {
	
	int insert(XueyaData xueyadata);
	
    int update(XueyaData xueyadata);
    
    int delete(String id);
    
    List<XueyaData> getXueYaData(XueyaData xueyainfo,PageQuery pageQuery);
    
    XueyaData getXueYaDataById(String id);

}
