import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumWhileLoop == sumFormula) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }
    }
}
