import java.util.Scanner;
public class NumberAnalysis {
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        }
        return "Positive";
    }
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            if (positivity.equals("Negative")) {
                System.out.println("Number " + numbers[i] + " is Negative");
            } else {
                String evenOdd = isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is Positive and " + evenOdd);
            }
        }
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }
}
