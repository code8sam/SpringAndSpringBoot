package edu.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

//@Component
public class ClassE
{
	public ClassE()
	{
		System.out.println(this.getClass().getSimpleName()+" Object is created!!");
	}
}