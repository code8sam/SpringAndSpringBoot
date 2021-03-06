package org.bluetree.employeeassignment.dao;

import java.util.List;

import javax.persistence.Query;

import org.bluetree.employeeassignment.dto.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDataBaseOperations
{
	private static SessionFactory factory;
	
	static
	{
		Configuration config = new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();
	}
	public List<Employee> getAllEmployees()
	{
		Session session = factory.openSession();
		Query query = session.createQuery("FROM Employee");
		return query.getResultList();
	}
	public boolean insertEmployee(Employee emp)
	{
		Session session = factory.openSession();
		session.save(emp);
		
		try
		{
		session.beginTransaction().commit();
		return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
	}
}
