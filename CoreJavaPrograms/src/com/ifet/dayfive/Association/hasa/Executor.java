package com.ifet.dayfive.Association.hasa;
public class Executor{
	public static void main(String[] args) {
		Address address = new Address("9", "Golden Colony", "Tamilnadu", "600000");
		Person person = new Person("Anithvar", address);
		person.displayInfo();
	}

}
