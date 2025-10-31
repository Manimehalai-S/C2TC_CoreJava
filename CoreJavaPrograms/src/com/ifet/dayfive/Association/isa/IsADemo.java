package com.ifet.dayfive.Association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Sagar", 101, "IT");
		Manager manager = new Manager("Anithvar", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
