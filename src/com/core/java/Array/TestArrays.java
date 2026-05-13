package com.core.java.Array;

public class TestArrays {
	
	public static void main(String[] args) {
		
		String [] names = {"Prachi","Ankit","Rohit","Aksh","Pankaj"};
		
		int [] marks = {23,48,78,89,98};
		
		for(int i = 0; i<names.length;i++) {
			
			if(names[i].startsWith("A")) {
				
				System.out.println(names[i]);
	
			}
		}
		System.out.println("===================================");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		System.out.println("===================================");
		
		for(int j = 0; j < marks.length ; j++) {
			
			if(marks[j]%2==0) {
				
				System.out.println(marks[j]);
				
			}
		}
		
		
		
	}

}
