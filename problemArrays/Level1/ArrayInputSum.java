import java.util.Scanner;
public class ArrayInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop:");
        while (true) {
            System.out.println("Enter number:");
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total sum of numbers: " + total);
    }
}
