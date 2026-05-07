package com.java.core.string;

public class TestString {

	public static void main(String[] args) {

		String day = "Tuesday";

		int length = day.length();

		System.out.println(length);

		char c = day.charAt(2);
		System.out.println(c);

		String daylower = day.toLowerCase();
		System.out.println(daylower);

		String abc = daylower.toUpperCase();
		System.out.println(abc);

		boolean flag = day.contains("E");
		System.out.println(flag);

		String xyx = day.concat("Abcd");
		System.out.println(xyx);

	}

}
