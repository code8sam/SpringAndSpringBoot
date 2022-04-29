package org.jspiders.constructorInjectionforpdtandstring.beans;

public class Student
{
	private int id;
	private String name;
	private Double marks;
	
	public Student()
	{
		System.out.println(this.getClass().getSimpleName()+" object is created using no-args constructor!!");
	}

	public Student(int id, String name, Double marks)
	{
		System.out.println(this.getClass().getSimpleName()+" object is created using args constructor!!");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
