public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + convertYardsToFeet(10));
        System.out.println("10 feet to yards: " + convertFeetToYards(10));
        System.out.println("5 meters to inches: " + convertMetersToInches(5));
        System.out.println("50 inches to meters: " + convertInchesToMeters(50));
        System.out.println("20 inches to centimeters: " + convertInchesToCentimeters(20));
    }
}
