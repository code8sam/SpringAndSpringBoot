package edu.jspiders.firstspringwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jspiders.firstspringwebapp.dao.StudentDataBaseOperations;
import edu.jspiders.firstspringwebapp.dto.Student;

@Service
public class MyService 
{
	@Autowired
	private StudentDataBaseOperations operations;
	
	public String insertStudentService(Student s)
	{
		if(operations.insertStudent(s))
			return "Registered!!";
		else
			return "NOT Registered!!!";
	}
}
