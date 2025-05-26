package com.codegnan.javaFeatures;

public interface Interf {
	
	
	public void SquareIt(int a);
	
	
	class Interf2 implements Interf{
		public void SquareIt(int a) {
			System.out.println("the square of number is :");
		}

		@Override
		public void SquareIt() {
			// TODO Auto-generated method stub
			
		}
	}


	public void SquareIt();
	
	
	
		
	

}
