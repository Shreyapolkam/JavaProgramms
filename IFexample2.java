package com.codegnan.Controlstatement;

import java.util.Scanner;

public class IFexample2 {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("emter your tempareture");
		int tempareture = scanner.nextInt();
		if(tempareture>30) {
			System.out.println("weather is too hot...please weare cotton dresses:");
			
		}else {
			//there is no specific logic
		}
	    if(tempareture>20 & tempareture<30){
	    	System.out.println("weather is normal.....enjoy ur day");
	    	
	    }else {
	    	//there is no specifi logic
	    } 
	    if(tempareture>10&tempareture<20) {
	    	System.out.println("weather is too cool .....wear the sweaters");
	    }else {
	    	//there is no specific logic
	    }
	    System.out.println();
	}
}
	