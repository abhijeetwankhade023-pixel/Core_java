package com.java.core.conditionalstatement;

public class nestedifcondition {

	public static void main(String[] args) {
		
		
		int a  = 12;
		
		if(a%2==0) {
			
			System.out.println("number is divisible by 2");
			
			if(a%3==0) {
				
				System.out.println("it is a good number");
			}
		}
		
	}
}
