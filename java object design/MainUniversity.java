import java.util.ArrayList;
class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Faculty Name: " + name;
    }
}
class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyList;
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }
    public void showFaculty() {
        System.out.println("Faculty members in the " + departmentName + " Department:");
        for (Faculty faculty : facultyList) {
            System.out.println(faculty);
        }
    }
}
class University {
    private String universityName;
    private ArrayList<Department> departments;
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println(department.getDepartmentName());
        }
    }
    public void showAllFaculty() {
        System.out.println("All Faculty members in the University:");
        for (Department department : departments) {
            department.showFaculty();
        }
    }
}
public class MainUniversity {
    public static void main(String[] args) {
        University university = new University("XYZ University");
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Management and Buisness Analytics");     
        Faculty faculty1 = new Faculty("Dr. Aashi Mittal");
        Faculty faculty2 = new Faculty("Prof. Ayush Thapak ");
        Faculty faculty3 = new Faculty("Dr. Akrati Gupta");
        Faculty faculty4 = new Faculty("Prof. Arpit Dubey");
        department1.addFaculty(faculty1);
        department1.addFaculty(faculty2);
        department2.addFaculty(faculty3);
        department2.addFaculty(faculty4);
        university.addDepartment(department1);
        university.addDepartment(department2);
        university.showDepartments();
        university.showAllFaculty();
        university = null;
        System.gc();
    }
}
