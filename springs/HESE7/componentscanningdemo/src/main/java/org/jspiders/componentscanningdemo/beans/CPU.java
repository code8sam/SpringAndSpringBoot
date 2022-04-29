package org.jspiders.componentscanningdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cpu")
public class CPU 
{
	@Autowired
	private Processor pro;
	@Autowired
	private HardDisk hd;
	@Autowired
	private MotherBoard mb;
	@Autowired
	private Ram ram;
	
	public CPU()
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using no-args constr..");
	}

	public CPU(Processor pro, HardDisk hd, MotherBoard mb, Ram ram)
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using args constr..");
		this.pro = pro;
		this.hd = hd;
		this.mb = mb;
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

	public MotherBoard getMb() {
		return mb;
	}

	public void setMb(MotherBoard mb) {
		this.mb = mb;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "CPU [pro=" + pro + ", hd=" + hd + ", mb=" + mb + ", ram=" + ram + "]";
	}
	
	
	
}
