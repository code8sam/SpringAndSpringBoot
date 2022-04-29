package org.jspiders.setterijectionforpdtandstring;

import org.jspiders.setterijectionforpdtandstring.beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
    	
    	Student s = context.getBean(Student.class);
    	System.out.println(s);
    	
    	context.close();
    }
}
