import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String dateInput1 = sc.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String dateInput2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(dateInput1);
        LocalDate date2 = LocalDate.parse(dateInput2);
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
