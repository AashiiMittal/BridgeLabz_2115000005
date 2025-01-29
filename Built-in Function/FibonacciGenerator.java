import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        generateFibonacci(terms);
    }
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first);
        for (int i = 1; i < n; i++) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
