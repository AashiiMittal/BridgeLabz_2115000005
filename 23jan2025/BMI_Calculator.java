import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        height = height / 100;  // Convert height from cm to meters
        double bmi = weight / (height * height);  // BMI formula
        System.out.println("Your BMI is: " + bmi);
        if (bmi <= 18.4) {
            System.out.println("Weight status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight status: Overweight");
        } else {
            System.out.println("Weight status: Obese");
        }
    }
}
