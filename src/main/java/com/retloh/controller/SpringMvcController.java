package com.retloh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.TUser;
import com.retloh.utils.JacksonMapper;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
@RequestMapping("/main")
public class SpringMvcController { 
    
    
    
    @RequestMapping(value="/welcome",method={RequestMethod.GET})
    public ModelAndView getFirstPage(HttpServletRequest request) {  
        ModelAndView mv = new ModelAndView();  
        mv.addObject("name", "蛤蛤");  
        mv.setViewName("welcom");
        return mv;  
    }
    
    
    @RequestMapping(value="/idiot",method={RequestMethod.GET})
    public ModelAndView idiot(HttpServletRequest request) {  
        ModelAndView mv = new ModelAndView();  
        mv.addObject("name", generateWord());  
        mv.setViewName("idiot");
        return mv;  
    }
    
    
    @RequestMapping(value="/getCache",method={RequestMethod.GET})
    @ResponseBody
    public String getCache(String key){
    	TUser fromToCache = (TUser)LocalCacheUtil.getInstance().getLocalCache(key);
    	String loginName = fromToCache.getLoginName();
    	long l = LocalCacheUtil.getInstance().getRemainTime(key);
    	String cache = JacksonMapper.beanToJson(fromToCache);
        return cache+"~~~"+l+"~~~"+loginName;
    }
    
    
    
    @RequestMapping(value="/random",method={RequestMethod.GET})
    @ResponseBody
    public String random() {
        return generateWord();
    }
    
    private String  generateWord(){
        String[] first = {"吃","喝","玩","切","砍","踏","拉","尿","吐","打"};
        String[] second = {"屎","尿","米饭","面条","洋芋","红薯","开水","雪碧","红茶","糖葫芦"};
        int f = (int)(Math.random()*10);
        int s = (int)(Math.random()*10);
        System.out.println(first[f]+second[s]);
        String comb = first[f]+second[s];
        return "你"+comb;
    }
    
    
} 
