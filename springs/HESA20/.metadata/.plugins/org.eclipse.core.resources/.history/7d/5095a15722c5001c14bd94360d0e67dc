package edu.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LightFactory 
{
	@Autowired
	@Qualifier("bulb")
	private Light l;
	
	public LightFactory() 
	{
		System.out.println("LightFactory Object is created!!!");
	}

	public Light getL() {
		return l;
	}

	public void setL(Light l) {
		this.l = l;
	}
	
	
}
