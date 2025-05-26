package com.codegnan.javaFeatures;
@FunctionalInterface
interface interfs{
	
	public void SquareIt(int a);
}

public class Test {
	

	public static void main(String[] args) {
		interfs I = (a)->System.out.println("the square root is " +a*a);
		I.SquareIt(3);
		
	}

}
