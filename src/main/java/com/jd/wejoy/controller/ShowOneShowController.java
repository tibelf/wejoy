package com.jd.wejoy.controller;

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
 * Date: 2014-10-5
 */

@Controller
public class ShowOneShowController {
	@RequestMapping(value="/shopxiu",  method = {RequestMethod.GET, RequestMethod.POST})
	public String shopcicle(ModelMap model) {
		return "shopxiu";
	}
	
}
