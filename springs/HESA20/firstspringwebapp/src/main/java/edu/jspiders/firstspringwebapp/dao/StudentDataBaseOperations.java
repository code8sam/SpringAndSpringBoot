package edu.jspiders.firstspringwebapp.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import edu.jspiders.firstspringwebapp.dto.Student;

@Repository
public class StudentDataBaseOperations
{
	private static SessionFactory factory;
	static
	{
		Configuration config = new Configuration();
		config.configure();
		
		factory = config.buildSessionFactory();
	}
	public boolean insertStudent(Student newStudent)
	{
		boolean b = false;
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(newStudent);
		
		try
		{
			tx.commit();
			b =  true;
		}
		catch (Exception e) 
		{
			tx.rollback();
			b = false;
		}
		session.close();
		return b;
	}
}
