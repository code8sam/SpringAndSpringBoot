package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassC 
{
	@Value("Ramu")
	private String s;
	
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is creared using no-args constr...");
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "ClassC [s=" + s + "]";
	}
	
	
}
