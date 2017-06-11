package com.retloh.service;

import java.util.List;

import com.retloh.model.PageQuery;
import com.retloh.model.XueyaDate;

public interface  XueYaDateServices {
	
	int insert(XueyaDate xueyadate);
	
    int update(XueyaDate xueyadate);
    
    int delete(String id);
    
    List<XueyaDate> getXueYaDate(XueyaDate xueyadate,PageQuery pageQuery);
    
    XueyaDate getXueYaDateById(String id);

}
