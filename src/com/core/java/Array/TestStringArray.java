package com.core.java.Array;

public class TestStringArray {

	
public static void main(String[] args) {
	
	String [] days = {"Mon","Tue","Wed","Thurs","Fri","Sat","Sun"};
	
	//System.out.println(days[3]);
	
	for(int i = 0; i<days.length;i++) {
		
	if(days[i].startsWith("T")){
		System.out.println(days[i]);
	}
	}
		
	}
}

