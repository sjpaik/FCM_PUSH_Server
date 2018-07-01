package com.sunseng.pushserver.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Admin Controller
 * @author sjpaik
 */
@Controller
public class AdminController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView adminLoginPage(ModelAndView model) {
		model.setViewName("/admin/index");
		return model;
	}
}
