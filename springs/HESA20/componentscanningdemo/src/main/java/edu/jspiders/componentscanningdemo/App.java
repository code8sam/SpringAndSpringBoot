package edu.jspiders.componentscanningdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.componentscanningdemo.beans.ClassA;
import edu.jspiders.componentscanningdemo.beans.ClassB;
import edu.jspiders.componentscanningdemo.beans.ClassD;
import edu.jspiders.componentscanningdemo.beans.ClassE;
import edu.jspiders.componentscanningdemo.beans.Light;
import edu.jspiders.componentscanningdemo.beans.LightFactory;
import edu.jspiders.componentscanningdemo.beans.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
        		new ClassPathXmlApplicationContext("componentscanningconfig.xml");
        
       /* ClassA a = (ClassA) context.getBean("classA");
        System.out.println(a);
        
        ClassB b1 = (ClassB) context.getBean("b");
        System.out.println(b1);
        
        ClassE e1 = context.getBean(ClassE.class);
        System.out.println(e1);
        
       // ClassD d1 = context.getBean(ClassD.class);
        
        Test t = context.getBean(Test.class);
        System.out.println(t);*/
        
        LightFactory factory = context.getBean(LightFactory.class);
        
        Light l = factory.getL();
        
       l.on();
       l.off();
        
        context.close();
    }
}