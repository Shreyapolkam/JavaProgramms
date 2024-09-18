import java .util.Scanner;
public class StudentData{
    public static void main(String[] args){
	        Scanner scanner=new Scanner(System.in);
			System.out.println("enter the name of the student:");
			String name=scanner.next();
			System.out.println("enter the id of the student:");
			Int id=scanner.nextInt();
			System.out.println("enter the marks of the student:");
			Int marks=scanner.nextInt();
			System.out.println("enter the gender of the student:");
			char gender=scanner.next().charAt(0);
			System.out.println("enter the age of the student:");
			int age=scanner.nextInt();
			System.out.println("name of the student is: "+name+" id of the student is : "+id+" marks of the student is :"+marks+" gender of the student is :"+gender+" age of the student is :"+age+"");

	}		
			
}