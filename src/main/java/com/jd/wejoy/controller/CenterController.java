package com.jd.wejoy.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CenterController extends HttpServlet {
    @RequestMapping(value="/test",  method = {RequestMethod.GET, RequestMethod.POST})
    public String test(ModelMap model) {
        return "test";
    }
    @RequestMapping(value="/shop",  method = {RequestMethod.GET, RequestMethod.POST})
    public String shop(HttpServletRequest request) {
    	String gender =  request.getParameter("gender");
    	if(gender.equals("male")){
    		return "shopmale";
    	}else if(gender.equals("female")){
    		return "shopfemale";
    	}else{
    		return null;
    	}
    }

    @RequestMapping(value="/classify",  method = RequestMethod.GET)
     public String classify(ModelMap model) {
        return "classify";
    }

    @RequestMapping(value="/classify_female",  method = RequestMethod.GET)
    public String classifyFemale(ModelMap model) {
        return "classify_female";
    }

    @RequestMapping(value="/custom_watch_detail",  method = RequestMethod.GET)
    public String customWatchDetail(ModelMap model) {
        return "custom_watch_detail";
    }
    
    @RequestMapping(value="/custom_share",  method = RequestMethod.GET)
    public String customShare(ModelMap model) {
        return "custom_share";
    }

    @RequestMapping(value="/address",  method = RequestMethod.GET)
    public String address(ModelMap model) {
        return "address";
    }

    @RequestMapping(value="/user_share",  method = RequestMethod.GET)
    public String userShare(ModelMap model) {
        return "user_share";
    }

    @RequestMapping(value="/user_share_without_xiu",  method = RequestMethod.GET)
    public String userShareWithoutXiu(ModelMap model) {
        return "user_share_without_xiu";
    }

    @RequestMapping(value="/user_share_xiu",  method = RequestMethod.GET)
    public String userShareXiu(ModelMap model) {
        return "user_share_xiu";
    }

    @RequestMapping(value="/record",  method = RequestMethod.GET)
    public String record(ModelMap model) {
        return "record";
    }

    @RequestMapping(value="/shopcircle",  method = RequestMethod.GET)
    public String shopcircle(ModelMap model) {
        return "shopcircle";
    }

    @RequestMapping(value="/shopcircle_sharesuccess",  method = {RequestMethod.GET, RequestMethod.POST})
    public String shopcircle_sharesuccess(ModelMap model) {
        return "shopcircle_sharesuccess";
    }

    @RequestMapping(value="/dasan",  method = {RequestMethod.GET, RequestMethod.POST})
    public String dasan(ModelMap model) {
        return "dasan";
    }

    @RequestMapping(value="/shopcircle_dasansuccess",  method = {RequestMethod.GET, RequestMethod.POST})
    public String dasansuccess(ModelMap model) {
        return "shopcircle_dasansuccess";
    }
}
