package com.jd.wejoy.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * 版权信息：@copyright Copyright 2014 JD.COM All Right Reserved
 * 关联类: ( @see )
 * 作者： zhaoyonggang 部门：云平台 |开放云事业部 |开放研发组 
 * 版本： 1.0
 * Date: 2014-9-27
 */
	@Controller
	public class CenterController {
	    @RequestMapping(value="/shop",  method = RequestMethod.GET)
	    public String shop(ModelMap model) {
//	        model.addAttribute("message", "wejoy，demo");
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
	        return "shop";
	    }

    @RequestMapping(value="/classify",  method = RequestMethod.GET)
    public String classify(ModelMap model) {
//	        model.addAttribute("message", "wejoy，demo");
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "classify";
    }
	}
