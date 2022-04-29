package org.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassC
{
	
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr...");
	}
}
