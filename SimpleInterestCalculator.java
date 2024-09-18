import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        double totalAmount = principal + simpleInterest;
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        
        scanner.close();
    }
}        
      
