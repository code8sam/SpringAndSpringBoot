package org.jspiders.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Test t = new Test();
       t.m1();*/
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
    	Test t = (Test) context.getBean("t");
    	t.m1();
    	
    }
}
