import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Employees = 10;
        double[] salary = new double[Employees];
        double[] yearsOfService = new double[Employees];
        double[] bonus = new double[Employees];
        double[] newSalary = new double[Employees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < Employees; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            while (true) {
                salary[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                } else {
                    break;
                }
            }
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            while (true) {
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < Employees; i++) {
            double currentBonus = 0.0;
            if (yearsOfService[i] > 5) {
                currentBonus = salary[i] * 0.05;
            } else {
                currentBonus = salary[i] * 0.02;
            }
            bonus[i] = currentBonus;
            newSalary[i] = salary[i] + currentBonus;
            totalBonus += currentBonus;
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees after bonus: " + totalNewSalary);
    }
}
