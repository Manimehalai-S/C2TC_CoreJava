package com.ifet.dayone;

public class IdentifiersDemo {   
	int age;                 
	String name;            

	void displayInfo() {     
		System.out.println(name + " is " + age + " years old.");
	}

	public static void main(String[] args) {
		IdentifiersDemo s1 = new IdentifiersDemo();  
		s1.name = "John";
		s1.age = 20;
		s1.displayInfo();
	}
	

}
