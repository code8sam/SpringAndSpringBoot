package edu.jspiders.componentscanningdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Bulb implements Light
{

	public Bulb() 
	{
		System.out.println("Bulb Object is created!!!");
	}
	@Override
	public void on()
	{
		System.out.println("Bulb is ON!!!");
	}

	@Override
	public void off() 
	{
		System.out.println("Bulb is OFF!!!");
	}

}
