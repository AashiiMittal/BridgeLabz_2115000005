import java.util.Scanner;
public class BMIcalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int numPersons = sc.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));
            double weight;
            do {
                System.out.print("Enter weight (in kg, positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive number. Please enter again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;
            double height;
            do {
                System.out.print("Enter height (in meters, positive value): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number. Please enter again.");
                }
            } while (height <= 0);
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("BMI Report:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI  | Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf( i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
