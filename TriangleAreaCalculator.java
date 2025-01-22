import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of the triangle in square inches is: " + areaInInches);
        System.out.println("The area of the triangle in square centimeters is: " + areaInCm);
        scanner.close();
    }
}
