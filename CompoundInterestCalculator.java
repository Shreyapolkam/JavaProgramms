import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
        System.out.printf("Total Amount: %.2f\n", amount);

        scanner.close();
    }
}
