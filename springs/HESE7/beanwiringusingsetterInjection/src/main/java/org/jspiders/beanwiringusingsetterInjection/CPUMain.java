package org.jspiders.beanwiringusingsetterInjection;

import org.jspiders.beanwiringusingsetterInjection.beans.CPU;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CPUMain {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("cpuconfig.xml");
		
		CPU cpu = (CPU) context.getBean("cpu");
		System.out.println(cpu);
		
		context.close();
	}

}
