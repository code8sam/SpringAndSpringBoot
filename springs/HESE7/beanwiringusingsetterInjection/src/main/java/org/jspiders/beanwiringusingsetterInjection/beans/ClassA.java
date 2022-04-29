package org.jspiders.beanwiringusingsetterInjection.beans;

public class ClassA 
{
	private ClassB b;
	
	public ClassA()
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr...");
	}

	
	public ClassA(ClassB b) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using args constr...");
		this.b = b;
	}


	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [b=" + b + "]";
	}
	
	
}
