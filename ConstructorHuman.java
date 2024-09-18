package com.codegnan.OOP;

public class ConstructorHuman {
	
	//instance variable 
	String name;
	int  age;
	
	//constructor
	public ConstructorHuman(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public  static void main(String[] args) {
		ConstructorHuman human1 = new ConstructorHuman("shreyaa" ,20);
		System.out.println(" Name : " + human1.name +  " Age : " + human1.age );
        
		ConstructorHuman human2 = new ConstructorHuman("vamshi" ,28);
		System.out.println(" Name : " + human2.name +  " Age : " + human2.age );
		
		ConstructorHuman human3 = new ConstructorHuman("anush" ,27);
		System.out.println(" Name : " + human3.name +  " Age : " + human3.age );
		
		ConstructorHuman human4 = new ConstructorHuman("sonu" ,25);
		System.out.println(" Name : " + human4.name +  " Age : " + human4.age );
        
        
        
		
		
	/*	ConstructorHuman human1 = new ConstructorHuman();
		
		human1.name = "shreyaa";
		
        human1.age = 20;
        
        System.out.println(" Name : " + human1.name +  " Age : " + human1.age );
        
        ConstructorHuman human2 = new ConstructorHuman();
        human2.name = "vamshi";
        human2.age = 28; 
        System.out.println(" Name : " + human2.name +  " Age : " + human2.age );
        
        ConstructorHuman human3 = new ConstructorHuman();
        human3.name = "sonu";
        human2.age = 26;
        System.out.println(" Name : " + human3.name +  " Age : " + human3.age );
        
        ConstructorHuman human4 = new ConstructorHuman();
        human2.name = "babblu";
        human2.age = 27;
        System.out.println(" Name : " + human4.name +  " Age : " + human4.age );*/
        
        
        
		
	}

}
