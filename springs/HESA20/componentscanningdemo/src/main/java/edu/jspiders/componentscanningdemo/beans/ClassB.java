package edu.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

//@Component("b")
public class ClassB
{
	public ClassB()
	{
		System.out.println(this.getClass().getSimpleName()+" Object is created!!");
	}
}