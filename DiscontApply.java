package com.codegnan.operators;

import java.util.Scanner;

public class DiscontApply {
	public static void main ( String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter the  purchase amount  in rupees : ");
		double  purchaseAmount = scanner.nextInt();
		
		
		// apply the discount based on your purchase amount
		 double discount = (purchaseAmount>=100)? 0.2 :(purchaseAmount>=50)?0.1 :0.0 ;
		 
		 
		 
		 //calculate discont in rupees
		 double  discountAmount = purchaseAmount * discount;
		 
		 
		 //after apply the discount pay the remaining  amount 
		 double remainingAmount = purchaseAmount - discountAmount;
		 
		  System.out.println("after apply the discount please  pay the remaining amount :" +remainingAmount);
	
		
	}
}
