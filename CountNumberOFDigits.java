package com.codegnan.Controlstatement;

import java.util.Scanner;

public class CountNumberOFDigits {
	public  static void  main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number :");
		int number = scanner.nextInt();
		int count = 0;  ///count
		int OriginalNumber= number;
		while(number!=0) {
			//int digit =  number%10; //number/10;
		     // sum=sum+digit;//count++;
		     number = number/10;
		     count++;
		     
		}
		System.out.println("the number of digits in a given number is "+number + "is "+count);
		
		
	}

}
