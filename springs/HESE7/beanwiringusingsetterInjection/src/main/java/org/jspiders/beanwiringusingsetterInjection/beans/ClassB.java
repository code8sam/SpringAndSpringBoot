package org.jspiders.beanwiringusingsetterInjection.beans;

public class ClassB 
{
	private int x;
	
	public ClassB() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr...");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "ClassB [x=" + x + "]";
	}
	
	
}
