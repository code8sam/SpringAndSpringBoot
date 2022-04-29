package org.jspiders.beanlifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassB
{
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is created!!!");
	}
	
	@PostConstruct
	public void myOwnInit()
	{
		System.out.println("in myownInit method!!!");
	}
	
	@PreDestroy
	public void myOwnDestroy()
	{
		System.out.println("in myOwnDestroy method!!!");
	}
}
