package com.codegnan.Controlstatement;
import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your marks :");
		int marks = scanner. nextInt();
		
		if (marks>90) {
			System.out.println("distinction");
					
		}else if(marks>80 && marks<70) {
			System.out.println("very good");
			
		}else if(marks>70 && marks<60) {
			System.out.println("good");
		}else if(marks>60 && marks<50) {
			System.out.println("Average");
		
		}else if(marks<50) {
			System.out.println("fail");
		}
	}

}
