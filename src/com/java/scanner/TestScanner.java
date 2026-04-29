package com.java.scanner;

import java.util.Scanner;

public class TestScanner {
   public static void main(String[] args) {
	   
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Please enter your year of birth : ");
	 
	    int yob = sc.nextInt();
	    
	    System.out.println("given input is :  " +yob);
	    
	    System.out.println("Please enter your cityname : ");
		 
	   String city= sc.next();
	    
	    System.out.println("City is :  " +city);
}
}