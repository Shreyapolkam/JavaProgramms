import java.util.Scanner;

public class CuboidVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        double volume = length * width * height;

        System.out.printf("The volume of the cuboid is: %.2f\n", volume);

        scanner.close();
    }
}
