package org.jspiders.beanwiringusingsetterInjection;

import org.jspiders.beanwiringusingsetterInjection.beans.ClassA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classAconfig.xml");
    	
    	ClassA a = (ClassA) context.getBean("a1");
    	System.out.println(a);
    	
    	context.close();
    	
    }
}
