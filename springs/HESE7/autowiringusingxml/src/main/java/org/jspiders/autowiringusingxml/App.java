package org.jspiders.autowiringusingxml;

import org.jspiders.autowiringusingxml.beans.ClassA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	ClassA a = (ClassA) context.getBean("a");
    	
    	System.out.println(a);
    	
    	context.close();
    }
}
