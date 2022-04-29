package edu.jspiders.myfirstspringmvcapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller1")
public class MyController 
{
	@RequestMapping("/index")
	public String getIndexPage()
	{
		return "index";
	}
	
	@RequestMapping(path="/form", method=RequestMethod.GET)
	public String getFormPage()
	{
		return "form";
	}
	
	@RequestMapping(path="/formData",method=RequestMethod.POST)
	public String getFormData(/*HttpServletRequest req*/@RequestParam("nm")String nm,Model model)
	{
		/*String nm = req.getParameter("nm");
		System.out.println(nm);*/
		
		model.addAttribute("name", nm);
		return "displayPage";
		
	}
}
