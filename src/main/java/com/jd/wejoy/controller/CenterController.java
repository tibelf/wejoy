package com.jd.wejoy.controller;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
