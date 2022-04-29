package org.jspiders.beanwiringusingsetterInjection.beans;

public class CPU
{
	private Ram ram;
	private Processor pro;
	private HardDisk hd;
	
	public CPU(Ram ram, Processor pro, HardDisk hd) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using args constr..");
		this.ram = ram;
		this.pro = pro;
		this.hd = hd;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public Processor getPro() {
		return pro;
	}
	public void setPro(Processor pro) {
		this.pro = pro;
	}
	public HardDisk getHd() {
		return hd;
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	@Override
	public String toString() {
		return "CPU [ram=" + ram + ", pro=" + pro + ", hd=" + hd + "]";
	}
	 
	
}
