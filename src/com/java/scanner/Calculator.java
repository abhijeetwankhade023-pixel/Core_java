package com.java.scanner;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter value of a : ");
		
		long a = sc.nextLong();
		
		System.out.println("please enter value  b : ");
		
		long b = sc.nextLong();
		
		long sum = a + b;
		
		System.out.println("Sum is : "+sum);
		
		long sub = a - b;
		System.out.println("Sub is :" +sub);
		

		long mul = a * b;
		System.out.println("Multiplication is :" +mul);
		

		long div = a/b;
		System.out.println("division is :" +div);
		

		long rem = a % b;
		System.out.println("Remainder is :" +rem);
		
		
		System.out.println("String value is :");
		
		String str = sc.next();
		
		System.out.println("String value is :" +str);
	}

}
