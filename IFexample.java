package com.codegnan.Controlstatement;

import java.util.Scanner;

public class IFexample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number :");
		int number = scanner.nextInt();
		if(number>0) {
	   	System.out.println("the given number is "+number+  " is positive");
	
	}else {
		//here there is no specifiv logic for else block.
	}

}
}
