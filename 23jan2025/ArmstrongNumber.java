import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();
        int originalNumber = number; 
        int sum = 0; 
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
