package com.retloh.service;

import java.util.List;
import java.util.Map;

import com.retloh.model.PageQuery;

public interface CountInfoServices {
	List<Map> countByUserId(PageQuery pageQuery);

}
