package edu.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Test
{
	@Value("10")
	private int x;
	@Value("Ramu")
	private String name;
	
	@Autowired
	private ClassA a;
	
	public ClassA getA() {
		return a;
	}

	public void setA(ClassA a) {
		this.a = a;
	}

	public Test() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is created!!");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", name=" + name + ", a=" + a + "]";
	}
}