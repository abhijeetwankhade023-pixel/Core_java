package com.java.twoclassVariable;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();

		s.id = 101;
		s.name = "Ram";
		s.city = "Pune";

		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.city);

		Student s1 = new Student();

		s1.id = 102;
		s1.name = "shyam";
		s1.city = "Shegaon";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
		
		Student s2 = new Student();

		s2.id = 103;
		s2.name = "Rohit";
		s2.city = "Khamgaon";
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.city);
		
		Student s3 = new Student();

		s3.id = 104;
		s3.name = "Prachi";
		s3.city = "Shegaon";
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.city);

		Student s4 = new Student();

		s4.id = 105;
		s4.name = "Virat";
		s4.city = "Delhi";
		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println(s4.city);



	}
}
