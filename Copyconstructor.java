package com.codegnan.OOP;

class person{
	
	String name;
	int age;
	
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//copy constructor 
	public person (person anotherPerson) {
		this. name = anotherPerson.name;
		this.age = anotherPerson.age;
	}
	
	//method to disply the details
	public void displayDetails() {
		System.out.println(" Name : "+name);
		System.out.println(" Age : "+age);
	}
	
}
public class Copyconstructor {
	//instanc variable

	public static void main(String[] args) {
		person person1 = new person("shreya",23);
		System.out.println("person1 details ");
		person1.displayDetails();
		
		
		person person2 = new person("vamshi" , 28);
		System.out.println("person2 details");
		person2.displayDetails();
		
		
		person person3 = new person(person2);
		System.out.println("person3 details(copy of person2 )");
		person3.displayDetails();
		
	}

}
