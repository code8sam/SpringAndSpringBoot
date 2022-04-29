package org.jspiders.componentscanningdemo;

import org.jspiders.componentscanningdemo.beans.CPU;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppCpu
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cpuconfig.xml");
		
		
		CPU cpu = (CPU) context.getBean("cpu");
		System.out.println(cpu);
		
		context.close();
	}
}
