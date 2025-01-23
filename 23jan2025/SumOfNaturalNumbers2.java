import java.util.Scanner;
public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumForLoop == sumFormula) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }
    }
}
