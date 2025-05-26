package come.codegnan.example;

class  Display {
	public  synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning")	;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.getStackTrace();
				
			}
			System.out.println(name);
		}
	}
	
}
class mythread extends Thread{
	Display d;
	String name;
	
	
	public  mythread (Display d, String name) {
		this.d= d;
		this.name= name;
	}
	public void run() {
		d.wish(name);
	}
	
}
public class Synchronized {

	public static void main(String[] args) {
		Display d1= new Display();
		mythread  t1= new mythread(d1,"Shreya");
		mythread  t2= new mythread(d1,"vamshi");	
		mythread  t3= new mythread(d1,"sonu");
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
