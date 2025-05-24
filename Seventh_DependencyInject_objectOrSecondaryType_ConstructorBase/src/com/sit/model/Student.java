package com.sit.model;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	private Address addr;
	public Student(int rollno, String name, String email, Address addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", addr=" + addr + "]";
	}
	
	

}
