package edu.jspiders.myfirstspringmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.jspiders.myfirstspringmvcapp.dto.Student;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@RequestMapping(path="/insert",method=RequestMethod.GET)
	public String getStudentFormPage()
	{
		return "insertStudentForm";
	}
	
	@RequestMapping(path="/insertStudent", method=RequestMethod.POST)
	public void insertStudents(Student s)
	{
		System.out.println(s);
	}
}
