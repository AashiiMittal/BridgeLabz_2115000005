import java.util.Scanner;
public class TriangularParkRun {
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(totalDistance / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle in meters:");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of the second side of the triangle in meters:");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of the third side of the triangle in meters:");
        double side3 = sc.nextDouble();
        double totalDistance = 5000;
        int rounds = calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    }
}
