//ternary operator
package com.codegnan.operators;

import java.util.Scanner;

public class AgeMinorMajor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = scanner. nextInt();
	//   String result = number % 2 == 0 ? "even" : "odd";   //	String num  = number > 0 ? "positive" : "negative" ; //age > 18 ? "you are eligible to vote" : "you are not eligible to vote" ;    // "major" : "minor" ;
		//System.out.println(result);
		char grade = marks > 90 ? 'a' 
				: (marks > 80)  && (marks < 90)? 'b'
						: (marks > 70) && (marks < 80) ? 'c' 
								: (marks > 60) && (marks < 70) ? 'd'
										:(marks > 50) && (marks < 60)  ? 'd' : 'f';
			
		System.out.println("the grade is :"+grade);
			
				
			
		
	}
}