package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.stereotype.Component;

@Component
public class TubeLight implements Light
{
	
	public TubeLight() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object is creared using no-args constr...");
	}

	@Override
	public void on() 
	{
		System.out.println("TubeLight is ON");
	}

	@Override
	public void off()
	{
		System.out.println("TubeLight is OFF");
	}

}
