package org.jspiders.beanlifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ClassA implements InitializingBean,DisposableBean
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is Created!!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Post intialization callback method!!!");
	}

	@Override
	public void destroy() throws Exception
	{
		System.out.println("Pre destruction callback method!!!");
	}
}
