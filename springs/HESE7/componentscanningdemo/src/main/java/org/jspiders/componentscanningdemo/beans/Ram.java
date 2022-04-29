package org.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ram 
{
	@Value("Corsair")
	private String brand;
	@Value("3000.00")
	private double price;
	
	public Ram() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr..");
	}

	public Ram(String brand, double price) {
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
		return "Ram [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
