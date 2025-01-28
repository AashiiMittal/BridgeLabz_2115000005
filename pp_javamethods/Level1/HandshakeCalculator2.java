import java.util.Scanner;
public class HandshakeCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = sc.nextInt();
        if (numberOfStudents < 2) {
            System.out.println("The number of students must be at least 2 to have handshakes.");
        } else {
            int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of possible handshakes is " + possibleHandshakes + ".");
        }
    }
}
