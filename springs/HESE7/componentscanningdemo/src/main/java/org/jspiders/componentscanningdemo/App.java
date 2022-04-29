package org.jspiders.componentscanningdemo;

import org.jspiders.componentscanningdemo.beans.ClassA;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcomponenescanconfig.xml");
    	
    	ClassA a = context.getBean(ClassA.class);
    	System.out.println(a);
    	
    	context.close();
    }
}
