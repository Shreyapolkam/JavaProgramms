package com.codegnan.Multithreading;
class myrunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("vara thread");
		}
	}
}
public class ThreadDemo_01 {

	public static void main(String[] args) {
		myrunnable r = new myrunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("devara thread");
		}
	}

}
