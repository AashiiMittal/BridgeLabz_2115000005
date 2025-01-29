import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().charAt(0);
        if (unit == 'C' || unit == 'c') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (unit == 'F' || unit == 'f') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
