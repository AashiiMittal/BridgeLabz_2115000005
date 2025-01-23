import java.util.Scanner;
public class LeapYearChecker {
    public static String multiFlow(int year) {
        if (year < 1582) {
            return "Year is not valid for the Gregorian calendar.";
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return year + " is a Leap Year.";
                } else {
                    return year + " is not a Leap Year.";
                }
            } else {
                return year + " is a Leap Year.";
            }
        } else {
            return year + " is not a Leap Year.";
        }
    }
    public static String singleFlow(int year) {
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            return year + " is a Leap Year.";
        } else if (year >= 1582) {
            return year + " is not a Leap Year.";
        } else {
            return "Year is not valid for the Gregorian calendar.";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        if (sc.hasNextInt()) {
            int year = sc.nextInt();
            System.out.println("Using multiple if-else statements:");
            System.out.println(multiFlow(year));
            System.out.println("Using single if statement with logical operators:");
            System.out.println(singleFlow(year));
        } else {
            System.out.println("Invalid input! Please enter a valid integer year.");
        }
    }
}
