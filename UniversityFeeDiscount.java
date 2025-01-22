import java.util.Scanner;
public class UniversityFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}