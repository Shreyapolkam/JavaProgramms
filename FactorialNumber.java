package com.codegnan.Controlstatement;
 import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number:");
		int number = scanner .nextInt(); 
		int result =1;
		for (int i=1; i<number;i++) {
			result = result + 1;
		}
		System.out.println("factorial number is "+number+" is" + result);
	}
      
}
