package com.core.java.parameterisedconstructor;



public class Employee {
	
	//global variable
	int age = 12;
	
	public Employee() {
		System.out.println("In Employee Constructor");
	}
	
	public void printName() {
		//local variable
		String name = "Akash";
		System.out.println(name);
		System.out.println(age);
	}

}
