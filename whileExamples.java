package com.codegnan.Controlstatement;
import java.util.Scanner;

public class whileExamples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number");
		int number = scanner.nextInt();
		int i =1;
		while (i<=number) {
			System.out.println(i);
			i=i+4;
		}
	}

}
