package com.sit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sit.model.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Student student = ap.getBean(Student.class);
		System.out.println(student);
	}
}
