package com.ifet.daysix.staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		Employee e = new Employee("Shubha", 123);
		System.out.println(e);
		
		
		e = new Employee("Deepa", 321);
		System.out.println(e);
	}

}
