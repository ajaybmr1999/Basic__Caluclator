package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalciController {
	
	@RequestMapping(value = "calc" , params = "btnAdd")
	public ModelAndView getAdd(String tbNum1, String tbNum2) {
		ModelAndView mv = new ModelAndView();
		//Convert String into Integer
		int fn = Integer.parseInt(tbNum1);
		int sn = Integer.parseInt(tbNum2);
		
		//Add the above two number and store it in an variable
		int res = fn + sn;
		
		//put the results in modelandview
		mv.addObject("result" , res);
		
		//redirect user to display page
		mv.setViewName("display.jsp");
		
		return mv;	
	}
	
	@RequestMapping(value = "calc" , params = "btnSub")
	public ModelAndView getSub(String tbNum1, String tbNum2) {
		ModelAndView mv = new ModelAndView();
		//Convert String into Integer
		int fn = Integer.parseInt(tbNum1);
		int sn = Integer.parseInt(tbNum2);
		
		//Sub the above two number and store it in an variable
		int res = fn - sn;
		
		//put the results in modelandview
		mv.addObject("result" , res);
		
		//redirect user to display page
		mv.setViewName("display.jsp");
		
		return mv;	
	}
	
	@RequestMapping(value = "calc" , params = "btnMul")
	public ModelAndView getMul(String tbNum1, String tbNum2) {
		ModelAndView mv = new ModelAndView();
		//Convert String into Integer
		int fn = Integer.parseInt(tbNum1);
		int sn = Integer.parseInt(tbNum2);
		
		//Multiply the above two number and store it in an variable
		int res = fn * sn;
		
		//put the results in modelandview
		mv.addObject("result" , res);
		
		//redirect user to display page
		mv.setViewName("display.jsp");
		
		return mv;	
	}
	
	@RequestMapping(value = "calc" , params = "btnDiv")
	public ModelAndView getDiv(String tbNum1, String tbNum2) {
		ModelAndView mv = new ModelAndView();
		//Convert String into Integer
		int fn = Integer.parseInt(tbNum1);
		int sn = Integer.parseInt(tbNum2);
		
		//Divide the above two number and store it in an variable
		int res = fn / sn;
		
		//put the results in modelandview
		mv.addObject("result" , res);
		
		//redirect user to display page
		mv.setViewName("display.jsp");
		
		return mv;	
	}
}
