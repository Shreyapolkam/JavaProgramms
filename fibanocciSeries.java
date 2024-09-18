package com.codegnan.Controlstatement;

import java.util.Scanner;

public class fibanocciSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of terms in the fibanocci series :");
		int number = scanner.nextInt();
		int firstNumber =0;
		int secondNumber =1;
		System.out.println("fibanocci series");
		System.out.println(firstNumber+" "+secondNumber+" ");
		for( int i =2 ;i<number;i++) {
			int nextNumber = firstNumber + secondNumber;
            System.out.println("  "+nextNumber);
            firstNumber=secondNumber;
            secondNumber=nextNumber;
			
		} 
		
		
		
	}

}
