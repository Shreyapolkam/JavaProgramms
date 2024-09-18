import java.util.Scanner;
public class AreaOfTriangle{
     public static void main(String[] args){
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the base of triangle(in meters) :");
	 double base = scanner.nextDouble();
	 System.out.println("enter the height of the triangle(in meters) :");
	 double height = scanner.nextDouble(); 
	 
	 double areaOfTriangle = 0.5*base*height;
	 System.out.println("the area of triangle is :"+areaOfTriangle);
	 }
	 
}