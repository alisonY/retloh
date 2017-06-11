package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.XueyaInfo;

public interface  XueYaInfoServices {
	
	int insert(XueyaInfo xueyainfo);
	
    int update(XueyaInfo xueyainfo);
    
    int delete(String id);
    
    List<XueyaInfo> getXueYaInfo(XueyaInfo xueyainfo,PageQuery pageQuery);
    
    XueyaInfo getXueYaInfoById(String id);

}
