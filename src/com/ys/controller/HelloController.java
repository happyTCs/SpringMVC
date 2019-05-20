package com.ys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author walt
 *
 */
public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new  ModelAndView();
		modelAndView.addObject("name","张三");
		modelAndView.setViewName("/WEB-INF/view/index.jsp");
		return modelAndView;
	}
	
}
