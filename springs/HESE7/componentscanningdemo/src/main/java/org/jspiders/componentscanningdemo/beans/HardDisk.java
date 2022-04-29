package org.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDisk 
{
	@Value("Transcend TS1TSJ25M3S StoreJet.")
	private String brand;
	@Value("2000.00")
	private double price;
	
	public HardDisk() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr..");
	}

	public HardDisk(String brand, double price) {
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
		return "HardDisk [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
