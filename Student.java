package com.firstPgm;

public class Student {


	public  void print_info(String name) {
		System.out.println("Name of Student:" +name);
	}
	public void print_info(int age) {
		System.out.println("Age of Student:" +age);
	}
	public static void print_info(String name, int age) {
		System.out.println("Basic inof of Student:" +name+age);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.print_info("Aman" );
		s1.print_info(23);
		s1.print_info("Aman ",24);
	}

}
