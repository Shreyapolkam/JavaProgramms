package com.codegnan.OOP;

public class CarClassObject {
	public static void main(String[] args) {
		CarClassExample car1= new  CarClassExample ("toyatto" ,"cramy" ,2020);
		CarClassExample car2 = new CarClassExample ("tata",  "acord" ,2024);
		System.out.println("car 1 details:");
		car1.displayCarDetails();
		System.out.println("car 2 details:");
		car2.displayCarDetails();
	}

}
