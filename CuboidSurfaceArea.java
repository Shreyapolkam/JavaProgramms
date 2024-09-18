import java.util.Scanner;

public class CuboidSurfaceArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        double surfaceArea = 2 * (length * width + width * height + height * length);

        System.out.printf("The surface area of the cuboid is: %.2f\n", surfaceArea);

        scanner.close();
    }
}
