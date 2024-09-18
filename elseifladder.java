package com.codegnan.Controlstatement;
 
import java.util.Scanner;

public class elseifladder {
      public static void main(String[] args) {
    	  Scanner scanner=new Scanner(System.in);
    	  System.out.println("enter your city name:");
    	  String cityName = scanner.next();
    	    
    	  
    	  if(cityName.equals("Hyderabad")) {//equalsIgnoreCase
    		  System.out.println("Hello Hyderabadi.....Namaste machaa..");
    		  
    	  }else if(cityName.equals("chennai")) {//equalsIgnoreCase
    		  System.out.println("Hello chennai...vanakkam");
    		 
    	  }else if(cityName.equals("Banglore")) {//equalsIgnoreCase
    		  System.out.println("Hello kannadiga...Namaskara");
    		  
    	  }else {
    		  System.out.println("please enter valid city name..");
    	  
    	  }
      }
}
