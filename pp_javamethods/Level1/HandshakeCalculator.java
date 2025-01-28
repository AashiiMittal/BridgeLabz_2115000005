import java.util.Scanner;
public class HandshakeCalculator {
    public static int totalHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("The number of students must be at least 2 to have handshakes.");
        } else {
            int handshakes = totalHandshakes(n);
            System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes + ".");
        }
    }
}
