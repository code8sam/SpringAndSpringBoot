package org.jspiders.springautowiringwithoutxml;

import org.jspiders.springautowiringwithoutxml.beans.ClassA;
import org.jspiders.springautowiringwithoutxml.beans.LightFactory;
import org.jspiders.springautowiringwithoutxml.config.MyOwnConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(MyOwnConfig.class);
    	
    	/*ClassA a = context.getBean(ClassA.class);
    	System.out.println(a);*/
    	
    	LightFactory lf = context.getBean(LightFactory.class);
    	System.out.println(lf);
    	
    	lf.getL().on();
    	lf.getL().off();
    	
    	context.close();
    }
}
