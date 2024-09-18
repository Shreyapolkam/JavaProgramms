import java.util.Scanner;

public class HemisphereSurfaceArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the hemisphere: ");
        double radius = scanner.nextDouble();

        double surfaceArea = 3 * Math.PI * Math.pow(radius, 2);

        System.out.printf("The surface area of the hemisphere is: %.2f\n", surfaceArea);

        scanner.close();
    }
}
