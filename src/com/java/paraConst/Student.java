package com.java.paraConst;

public class Student {
	
	//public Student() {
		
		//System.out.println("Default Constructor");
	//}
	
	public String stName;
	

	public Student(String name) {
		
		stName = name;
		
		//System.out.println(name);
	}
	
	public void printName() {
		System.out.println("Name is :" +stName);
	}
}
