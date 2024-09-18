package com.codegnan.OOP;


public class CarClassExample {
	
	//instant variable
	String  brand;
	String  model;
	int  year;
	
	//constructor 
	public  CarClassExample(String  brand, String  model,int  year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		
	}
    public void displayCarDetails() {
    	System.out.println("Barnd :"   +brand);
    	System.out.println("Model :"   +model);
    	System.out.println("Year :"    +year);
    }
    
}
