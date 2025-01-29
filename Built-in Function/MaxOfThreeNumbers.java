import java.util.Scanner;
public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }
    public static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
