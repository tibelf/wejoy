package com.jd.wejoy.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

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
public class CenterController extends HttpServlet {
    @RequestMapping(value="/test",  method = {RequestMethod.GET, RequestMethod.POST})
    public String test(ModelMap model) {
//	        model.addAttribute("message", "wejoy，demo");
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//	        model.addAttribute("date", dateFormat.format(new java.util.Date()));

        return "test";
    }
    @RequestMapping(value="/shop",  method = {RequestMethod.GET, RequestMethod.POST})
    public String shop(HttpServletRequest request) {
    	String gender =  request.getParameter("gender");
    	if(gender.equals("male")){ //男士
    		return "shopmale";
    	}else if(gender.equals("female")){ //女士
    		return "shopfemale";
    	}else{
    		return null;
    	}
    }

    @RequestMapping(value="/classify",  method = RequestMethod.GET)
     public String classify(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "classify";
    }

    @RequestMapping(value="/classify_female",  method = RequestMethod.GET)
    public String classifyFemale(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "classify_female";
    }

    @RequestMapping(value="/custom_watch_detail",  method = RequestMethod.GET)
    public String customWatchDetail(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "custom_watch_detail";
    }
    
    @RequestMapping(value="/custom_share",  method = RequestMethod.GET)
    public String customShare(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "custom_share";
    }

    @RequestMapping(value="/address",  method = RequestMethod.GET)
    public String address(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "address";
    }

    @RequestMapping(value="/user_share",  method = RequestMethod.GET)
    public String userShare(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "user_share";
    }

    @RequestMapping(value="/user_share_without_xiu",  method = RequestMethod.GET)
    public String userShareWithoutXiu(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "user_share_without_xiu";
    }

    @RequestMapping(value="/user_share_xiu",  method = RequestMethod.GET)
    public String userShareXiu(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "user_share_xiu";
    }

    @RequestMapping(value="/record",  method = RequestMethod.GET)
    public String record(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "record";
    }

    @RequestMapping(value="/shopcircle",  method = RequestMethod.GET)
    public String shopcircle(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "shopcircle";
    }

    @RequestMapping(value="/shopcircle_sharesuccess",  method = {RequestMethod.GET, RequestMethod.POST})
    public String shopcircle_sharesuccess(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "shopcircle_sharesuccess";
    }

    @RequestMapping(value="/dasan",  method = {RequestMethod.GET, RequestMethod.POST})
    public String dasan(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "dasan";
    }

    @RequestMapping(value="/shopcircle_dasansuccess",  method = {RequestMethod.GET, RequestMethod.POST})
    public String dasansuccess(ModelMap model) {
        //	        model.addAttribute("message", "wejoy，demo");
        //	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
        return "shopcircle_dasansuccess";
    }
}
