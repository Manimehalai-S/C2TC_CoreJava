package com.ifet.dayfive.multilevelinheritance;

public class MultilevelinheritanceDemo {
	public static void main(String[] args) {

		Person p1 = new Person("Athar", 7878767676l, null);
		System.out.println(p1);

		p1 = new Employee("Pranav", 8080807070l,null, "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l,null, "Account", 85000, 200,"Signing Authority");
		System.out.println(p1);
	}

}

