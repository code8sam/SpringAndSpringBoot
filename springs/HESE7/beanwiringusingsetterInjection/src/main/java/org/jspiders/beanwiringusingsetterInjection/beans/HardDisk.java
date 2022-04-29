package org.jspiders.beanwiringusingsetterInjection.beans;

public class HardDisk 
{
	private String brand;
	private double price;
	
	public HardDisk()
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr..");
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
