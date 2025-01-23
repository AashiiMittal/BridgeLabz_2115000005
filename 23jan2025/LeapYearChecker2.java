import java.util.Scanner;

public class LeapYearChecker2 {
    public static String singleIf(int year) {
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return year + " is a Leap Year.";
        } else if (year >= 1582) {
            return year + " is not a Leap Year.";
        } else {
            return "Year is not valid for the Gregorian calendar.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            System.out.println(singleIf(year));
        } else {
            System.out.println("Invalid input! Please enter a valid year.");
        }
    }
}
