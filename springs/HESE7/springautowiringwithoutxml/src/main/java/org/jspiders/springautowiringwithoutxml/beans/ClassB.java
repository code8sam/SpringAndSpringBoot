package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB 
{
	@Autowired
	private ClassC c;
	
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is creared using no-args constr...");
	}

	public ClassC getC() {
		return c;
	}

	public void setC(ClassC c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "ClassB [c=" + c + "]";
	}
	
	
}
