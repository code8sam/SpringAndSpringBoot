package org.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Processor 
{
	@Value("AMD 4.0 GHz FM2 A4 6320 Processor")
	private String brand;
	@Value("4000.00")
	private double price;
	
	public Processor() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr..");
	}

	public Processor(String brand, double price) {
		System.out.println(this.getClass().getSimpleName()+" Object created using args constr..");
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
