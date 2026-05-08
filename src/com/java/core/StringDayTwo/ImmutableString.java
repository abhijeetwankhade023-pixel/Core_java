package com.java.core.StringDayTwo;

public class ImmutableString {
	
	public static void main(String[] args) {
		
		String pwd = "Friday1234";
		String pwd2 =pwd.toUpperCase();
		
		System.out.println(pwd2);
		
		System.out.println(System.identityHashCode(pwd));
		System.out.println(System.identityHashCode(pwd2));
		
		if(pwd == pwd2) {
			
			System.out.println("Both are in same memory location");
		}else {
			
			System.out.println("Not in same memory location");
		}
		
	}

}
