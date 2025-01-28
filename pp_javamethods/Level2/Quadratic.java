import java.util.Scanner;
public class Quadratic {
    public static void findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two roots found: ");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One root found: ");
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots exist.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a, b, and c in the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        findRoots(a, b, c);
    }
}
