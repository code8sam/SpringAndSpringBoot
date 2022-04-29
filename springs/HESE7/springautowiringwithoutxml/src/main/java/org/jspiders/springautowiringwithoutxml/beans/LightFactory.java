package org.jspiders.springautowiringwithoutxml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LightFactory
{
	@Autowired
	@Qualifier("bulb")
	private Light l;

	public Light getL() {
		return l;
	}

	public void setL(Light l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "LightFactory [l=" + l + "]";
	}
	
	
}
