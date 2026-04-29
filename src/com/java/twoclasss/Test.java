package com.java.twoclasss;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First name : ");

		String fname = sc.next();

		System.out.println("Enter Second name : ");

		String lname = sc.next();

		System.out.println("Enter age : ");

		int age = sc.nextInt();

		UsernameGenerator generator = new UsernameGenerator();

		String username = generator.getUsername(fname, lname, age);

		System.out.println("Username is : " + username);
	}
}
