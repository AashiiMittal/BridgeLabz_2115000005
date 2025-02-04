class Employee {
    private static String companyName = "A&A Groups";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}
public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aashi", 101, "Software Analyst");
        Employee employee2 = new Employee("Ayush", 102, "Python Developer");
        employee1.displayDetails();
        employee2.displayDetails();
        Employee.displayTotalEmployees();
    }
}