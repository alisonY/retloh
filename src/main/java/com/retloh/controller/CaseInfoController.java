package com.retloh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.CaseInfo;
import com.retloh.service.CaseInfoServices;
import com.retloh.utils.JacksonMapper;

@Controller
public class CaseInfoController {
	/*
	 * 病例信息入库
	 */
	
	@Autowired
    private CaseInfoServices caseInfoServices;
	
	@RequestMapping(value="/postcase",method={RequestMethod.POST})
    @ResponseBody
    public String postCase(HttpServletRequest request) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line);
        }
        String jsonstr = sb.toString();
        
		ObjectMapper mapper = new ObjectMapper();
	    CaseInfo caseinfo = mapper.readValue(jsonstr, CaseInfo.class);
	    caseInfoServices.insert(caseinfo);
    	return "ok";
    }
	
	@RequestMapping(value="/allCaseInfo",method={RequestMethod.POST})
    @ResponseBody
    public String allCaseInfo(HttpServletRequest request) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line);
        }
        String jsonstr = sb.toString();
        
		ObjectMapper mapper = new ObjectMapper();
	    CaseInfo caseinfo = mapper.readValue(jsonstr, CaseInfo.class);
	    caseInfoServices.insert(caseinfo);
    	return "ok";
    }

}
