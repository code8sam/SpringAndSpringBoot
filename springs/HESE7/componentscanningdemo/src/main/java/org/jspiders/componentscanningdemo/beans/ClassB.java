package org.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassB
{
	
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr...");
	}
}
