package edu.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

//@Component
public class ClassC
{
	public ClassC()
	{
		System.out.println(this.getClass().getSimpleName()+" Object is created!!");
	}
}