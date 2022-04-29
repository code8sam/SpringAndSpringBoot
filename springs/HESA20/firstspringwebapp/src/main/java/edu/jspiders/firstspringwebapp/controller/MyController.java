package edu.jspiders.firstspringwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.firstspringwebapp.dto.Student;
import edu.jspiders.firstspringwebapp.service.MyService;

@Controller
@RequestMapping("/con1")
public class MyController 
{
	@Autowired
	private MyService myService;
	
	@RequestMapping("/home")
	public String getIndexPage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String getRegisterPage()
	{
		return "registerPage";
	}
	
	@RequestMapping("/registerdata1")
	public String registerDataWay1(HttpServletRequest req,Model myModel)
	{
		System.out.println("in registerdataway1");
		
		/*String id = req.getParameter("id");*/
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String marks = req.getParameter("marks");
		
		Student s = new Student();
		s.setFirstName(fname);
		s.setLastName(lname);
		s.setMarks(Double.parseDouble(marks));
		
		String msg = myService.insertStudentService(s);
		
		myModel.addAttribute("message", msg);
		return "displayMsg";
	}
}
