import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Input is not a natural number. Exiting.");
            return;
        }
        int recursiveResult = recursiveSum(number);
        int formulaResult = formulaSum(number);
        System.out.println("Sum of " + number + " natural numbers using recursion: " + recursiveResult);
        System.out.println("Sum of " + number + " natural numbers using formula: " + formulaResult);
        if (recursiveResult == formulaResult) {
            System.out.println("Both methods give the same result. The computation is correct.");
        } else {
            System.out.println("There is an error in the computation.");
        }
    }
}
