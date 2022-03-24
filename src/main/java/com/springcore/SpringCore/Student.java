package com.springcore.SpringCore;

public class Student {
	int id;
	String name;
	String Addresss;
	
	
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
	public String getAddresss() {
		return Addresss;
	}
	public void setAddresss(String addresss) {
		Addresss = addresss;
	}
	
	
	public Student(int id, String name, String addresss) {
		super();
		this.id = id;
		this.name = name;
		Addresss = addresss;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Addresss=" + Addresss + "]";
	}
	
	

}
