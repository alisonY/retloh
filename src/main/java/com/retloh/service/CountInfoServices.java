package com.retloh.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.retloh.model.PageQuery;

public interface CountInfoServices {
	List<Map> countByUserId(HttpServletRequest request,PageQuery pageQuery);

}
