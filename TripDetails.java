import java.util.Scanner;
public class TripDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter the city you are traveling to: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter the total time taken for the trip in hours: ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.println("\nTrip Details:");
        System.out.println("Traveler: " + name);
        System.out.println("Starting City: " + fromCity);
        System.out.println("Via City: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
    }
}
