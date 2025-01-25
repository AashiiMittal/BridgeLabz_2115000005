import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int numPersons = sc.nextInt();
        double[] height = new double[numPersons];
        double[] weight = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.println("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
            System.out.println("Enter height (in meters): ");
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("BMI Report:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI  | Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.println( i + 1, height[i], weight[i], bmi[i], status[i]);
        }
    }
}
