package org.jspiders.springautowiringwithoutxml.config;

import org.jspiders.springautowiringwithoutxml.beans.ClassA;
import org.jspiders.springautowiringwithoutxml.beans.ClassB;
import org.jspiders.springautowiringwithoutxml.beans.ClassC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.jspiders.springautowiringwithoutxml.beans")
public class MyOwnConfig 
{
	/*@Bean
	public ClassA getA()
	{
		return new ClassA();
	}
	
	@Bean
	public ClassB getB()
	{
		return new ClassB();
	}
	
	@Bean
	public ClassC getC()
	{
		return new ClassC();
	}*/
}
