import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        int[] studentAges = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Age of student " + (i + 1) + ":");
            studentAges[i] = sc.nextInt();
        }
        System.out.println("Voting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age (" + studentAges[i] + ")");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + ": Can vote");
            } else {
                System.out.println("Student " + (i + 1) + ": Cannot vote");
            }
        }
    }
}
