package com.jd.wejoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowOneShowController {
	@RequestMapping(value="/shopxiu",  method = {RequestMethod.GET, RequestMethod.POST})
	public String shopcicle(ModelMap model) {
		return "shopxiu";
	}
	
	@RequestMapping(value="/shopaddsign",  method = {RequestMethod.GET, RequestMethod.POST})
	public String shopget(ModelMap model) {
		return "shopaddsign";
	}
	
	@RequestMapping(value="/showrelease",  method = {RequestMethod.GET, RequestMethod.POST})
	public String showrelease(ModelMap model) {
		return "showrelease";
	}
}
