package org.jspiders.constructorInjectionforpdtandstring;

import org.jspiders.constructorInjectionforpdtandstring.beans.Student;
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
        
        Student s = (Student) context.getBean("s1");
        
        System.out.println(s);
        
        context.close();
    }
}
