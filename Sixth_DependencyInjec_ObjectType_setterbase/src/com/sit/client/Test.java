package com.sit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sit.model.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		
		Student student = ap.getBean(Student.class);
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getAddr().getCityName());
		System.out.println(student.getAddr().getAreaName());
	}

}
