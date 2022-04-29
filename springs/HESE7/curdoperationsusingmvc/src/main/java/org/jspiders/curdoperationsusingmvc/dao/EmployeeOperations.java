package org.jspiders.curdoperationsusingmvc.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jspiders.curdoperationsusingmvc.dto.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeOperations 
{
	private static SessionFactory factory = null;
	static
	{
		Configuration config = new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();
	}
	
	public List<Employee> getAllEmployees()
	{
		Session session = factory.openSession();
		Query query = session.createQuery("from Employee");
		
		List<Employee> allEmployees = query.getResultList();
		session.close();
		return allEmployees;
	}

	public void insertEmployee(Employee emp) 
	{
		Session session = factory.openSession();
		session.save(emp);
		session.beginTransaction().commit();
	}
}
