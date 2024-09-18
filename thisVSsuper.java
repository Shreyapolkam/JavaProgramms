package com.codegnan.OOP;

//superclass of a vechil
class vechile{
	String brand;
	
	//constructor for vechil class
	public vechile (String brand) {
		this .brand  = brand;
		System.out.println("vechile class invoked");	
	}
	
	//metghod to display brand of the vechil
	public void displayBrand() {
		System.out.println("Brand :" +brand);
		
		
	}
	
}
	//class name bike  of a subclass
	class Bike extends vechile {
		int year;
		
		//constructor
		public Bike(String brand ,int year) {
			super(brand);//call super clas cstro to initlize brand
			this.year = year;
			System.out.println("bike construor");
		}
		
		//constructor of a car class with brand only
		public Bike (String brand) {
			this(brand,2020);//call another constructor of a same class
			
		}
		//method to display details of bike
		public void displayDetails() {
			super.displayBrand();//call super class method to display brand
			System.out.println("Year :" +year);
		}
		
	}

public class thisVSsuper{
	public static void main(String[] args){
		Bike bike1 = new Bike("honda",2020);
		Bike bike2= new Bike("2024");
		
		System.out.println("Bike 1 details");
		bike1.displayDetails();
		
		System.out.println("Bike 2 details");
		bike2.displayDetails();
		
	}

}

