import java.util.ArrayList;
class Employee {
    private String name;
    private String role;
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String toString() {
        return "Employee Name: " + name + ", Role: " + role;
    }
}
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + " Department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
class Company {
    private String companyName;
    private ArrayList<Department> departments;
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
    public void cleanup() {
		System.out.println("Cleaning up Company " + companyName);
		departments.clear();
	}
}
public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company("A&A Groups");
        Department department1 = new Department("Software Testing");
        department1.addEmployee(new Employee("Aashi", "Software Analyst"));
        department1.addEmployee(new Employee("Ayush", "Senior Developer"));
        Department department2 = new Department("HR");
        department2.addEmployee(new Employee("Akrati", "HR Manager"));
        department2.addEmployee(new Employee("Arpit", "HR Executive"));
        company.addDepartment(department1);
        company.addDepartment(department2);
        company.displayCompanyDetails();
		company.cleanup();
		company = null;
		System.gc();
    }
}
