package org.jspiders.constructorinjectionforcollectionandMap;

import org.jspiders.constructorinjectionforcollectionandMap.beans.ColletionType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
    	
    	ColletionType col = (ColletionType) context.getBean("col1");
    	System.out.println(col);
    	
    	context.close();
    }
}
