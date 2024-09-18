package com.codegnan.Controlstatement;

import java.util.Scanner;

public class IFexample3ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double AccountBalance = 20000.0;
		System.out.println("enter ampunt to withdraw");
		double withdrawAmount = scanner . nextDouble();
		
		if(withdrawAmount<AccountBalance) {
			double remainingAmount = AccountBalance-withdrawAmount;
			System.out.println(withdrawAmount+"is withdraw scussfully...remaining balance is"+remainingAmount);
	    }else {
		System.out.println("insufficient funds in your account...........please check your account blance");
	    }
		
	}

}
