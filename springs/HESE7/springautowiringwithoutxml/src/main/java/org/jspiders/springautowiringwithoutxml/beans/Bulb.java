package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.stereotype.Component;

@Component
public class Bulb implements Light
{
	public Bulb() {
		System.out.println(this.getClass().getSimpleName()+" Object is creared using no-args constr...");
	}

	@Override
	public void on() 
	{
		System.out.println("BULB is ON");
	}

	@Override
	public void off()
	{
		System.out.println("BULB is OFF");
	}

}
