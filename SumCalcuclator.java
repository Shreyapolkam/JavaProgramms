  //package statement
import java.util.Scanner;  //import statement
public class SumCalcuclator{  //classes statement
     public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
		 int firstNumber = scanner.nextInt();
		 int seconfNumber = scanner.nextInt();
		 int sum = firstNumber+seconfNumber;
		 System.out.println("sum of "+firstNumber+"and : "+seconfNumber+ "is "+sum);
     
	 }
}