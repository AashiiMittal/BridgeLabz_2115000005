import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        boolean found = false;
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        while (!found) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (Enter 'h' for high, 'l' for low, 'c' for correct)");
            char feedback = sc.next().charAt(0);
            switch (feedback) {
                case 'h':
                    high = guess - 1;
                    break;
                case 'l':
                    low = guess + 1;
                    break;
                case 'c':
                    found = true;
                    System.out.println("Great! I guessed your number.");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }
    }
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
