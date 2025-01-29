import java.util.Scanner;
public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double multiply(double x, double y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String nextCalculation;
        double num1, num2;
        do {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter choice (1/2/3/4): ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                if (choice == 1) {
                    System.out.println("The result is: " + add(num1, num2));
                } else if (choice == 2) {
                    System.out.println("The result is: " + subtract(num1, num2));
                } else if (choice == 3) {
                    System.out.println("The result is: " + multiply(num1, num2));
                } else if (choice == 4) {
                    System.out.println("The result is: " + divide(num1, num2));
                }
            } else {
                System.out.println("Invalid input! Please choose a valid operation.");
            }
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            nextCalculation = sc.next();
            if (!nextCalculation.equals("yes")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
        } while (true);
    }
}
