package com.codegnan.Multithreading;
class  Mythread extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("child thread");

		}
		}
	
}

public class threadDemo {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		for(int i = 0; i<10; i++) {
			System.out.println("main thread");


		}

	}

}

class  Mythreaad extends Thread{
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("child thread");

		}
		}
	
}
