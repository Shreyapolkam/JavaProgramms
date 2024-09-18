package com.codegnan.OOP;

public class MethodExample {
	
	

	//with out return type and without parameter
   public void wishMessage() { 
	   	   System.out.println("hey guys how are you welcome back to my channel amrad lo ammakutti");
	   
   }
   //without return type with paramaetr
    public void  printSum(int a, int b) {
		int sum = a-b;  
		System.out.println("Sum :"+sum );
		
    }
     //with return type with paramaetr

    public int multiply(int a , int b) {  
    	return a*b;
    }
    
      //with return type without paramaetr

	public String Greeting() {
	 return "hello shreya........... how are you";
	
	}
       
	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		obj.wishMessage();
		
		obj.printSum(10,20);
		
		int mul = obj.multiply(30,20);
		System.out.println("multipy is :" +mul);
		
		String msg = obj.Greeting();
		System.out.println("message for shreya :" +msg);
		
}
}