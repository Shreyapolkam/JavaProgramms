package com.codegnan.OOP;

public class overLoading {
	public int add(int a ,int b) {
		return a+b;
	}
	public float add(double a,double b,double c ) {
		return  (float) (a+ b+ c);
	}
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}

	public static void main(String[] args) {
		overLoading example = new overLoading();
		System.out.println("the sum of 5 and 6 is :"+ example.add(5,6));
		System.out.println("the sum of 5.3 and 6.4 and 4.4 is :"+ example.add(5.3,6.4,4.4));

		
	}

}
