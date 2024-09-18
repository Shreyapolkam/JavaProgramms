package com.codegnan.Controlstatement;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	     System.out.println("enter the number to reverse:");
	     int number = scanner.nextInt();
	     int ReverseNumber = 0;
	     int originalNumber = number;
	     while(originalNumber!=0) {
	    	 int remainder = originalNumber % 10;
	    	 ReverseNumber=ReverseNumber+remainder*remainder*remainder; //ReverseNumber*10+remainder for palindrome
	    	 originalNumber=originalNumber/10;
	    	 
	     }
	     
	    // System.out.println("the reverse of a number"+number+"is"+ ReverseNumber);
	     //palindrome program*********************************************************//
				if(number==ReverseNumber) {
					System.out.println(number +" is Amstrong");//palindrome
				}else {
					System.out.println(number +"is not A Amstrong");//palindrome
				
			
					
				}
	}

}

