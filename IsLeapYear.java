package com.codegnan.operators;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your year :");
		int year = scanner.nextInt();
		
		
		boolean isLeapYear = (year % 4 == 0) && (year % 100!= 0 || year % 400 ==0 );
		 
		String result = isLeapYear ? "is a leap year " : "is not a leap year" ;
		
		 System.out.println(result);

	}

}
