class Vehicle {
    private static double registrationFee = 1000.00;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Aashi", "Activa", "V567");
        Vehicle vehicle2 = new Vehicle("Ayush", "Car", "V987");
        vehicle1.displayDetails();
        vehicle2.displayDetails();
        Vehicle.updateRegistrationFee(1500.00);
        vehicle1.displayDetails();
        vehicle2.displayDetails();
    }
}