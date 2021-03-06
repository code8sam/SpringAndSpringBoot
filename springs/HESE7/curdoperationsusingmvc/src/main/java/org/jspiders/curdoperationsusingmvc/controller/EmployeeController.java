package org.jspiders.curdoperationsusingmvc.controller;

import java.util.List;

import org.jspiders.curdoperationsusingmvc.dto.Employee;
import org.jspiders.curdoperationsusingmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(path="/display",method=RequestMethod.GET)
	public String getDisplayEmployeesPage(Model model)
	{
		List<Employee> allEmployees = service.displayAllEmployee();
		model.addAttribute("allEmps",allEmployees);
		return "displayAllEmployees";
	}
	
	@RequestMapping(path="/insert", method=RequestMethod.GET)
	public String getInsertEmployeeFormPage()
	{
		return "insertEmployeeForm";
	}
	
	@RequestMapping(path="/insertEmp", method=RequestMethod.GET)
	public String InsertEmployeeData(Employee emp)
	{
		service.addemployee(emp);
		return "redirect:display";
	}
}
