package com.codegnan.patternStatement;

public class TrianglePattern2 {
	public static void main(String[] args) {
 int row = 10;
		//outer forloop for each row
 for(int i = 0; i < 10; i++) {
	 
	 //inner forloop print space before start
	 for(int j = 0; j<row-i-1;j++) {
		 System.out.print(" ");
	 }
	 
	 //inner for loop to print the stars to each row
	 for(int k = 0; k<=i; k++) {
	 System.out.print("* ");   
	 }
	 System.out.println();
 }
 //lower half of the diamond
 //outer for loop  for rows
 for(int i = 0; i<row-1; i++) {
	for(int j = 0; j<=i; j++) {
		System.out.print(" ");
	}
	for(int k = 0; k<row-1-i; k++) {
		System.out.print("* ");
	}
	System.out.println();
 }
	}

}
