package org.jspiders.setterinjjectionforcollectionandmap;

import org.jspiders.setterinjjectionforcollectionandmap.beans.ColletionType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("coolectionConfig.xml");
    	
    	ColletionType col = (ColletionType) context.getBean("col1");
    	
    	System.out.println(col);
    	
    	context.close();
    }
}
