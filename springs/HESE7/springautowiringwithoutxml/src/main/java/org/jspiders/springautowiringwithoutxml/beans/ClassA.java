package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassA 
{
	@Value("10")
	private int x;
	
	@Autowired
	private ClassB b;
	
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is creared using no-args constr...");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [x=" + x + ", b=" + b + "]";
	}
	
	
}
