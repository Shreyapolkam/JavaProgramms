package com.codegnan.operators;

import java.util.Scanner;

public class ternaryOperator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*System.out.println("enter your age :");
		int age = scanner.nextInt();
		String result = age>18? " you are eligible to vote (major)":" you are not eligible to vote (minor)";// for vote
		System.out.println(result);*/
		
		System.out.println("enter the number:");
		int num = scanner.nextInt();
        String result = num % 2==0? "even":"odd";
        System.out.println(result);
        

	}	

} 
