package org.jspiders.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("declerativeConfig.xml");
    	
    	context.close();
    }
}
