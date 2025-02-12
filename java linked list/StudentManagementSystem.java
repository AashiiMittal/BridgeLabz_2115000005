class StudentNode {
    int rollNumber, age;
    String name, grade;
    StudentNode next;
    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentManagementSystem {
    private StudentNode head;
    public StudentManagementSystem() {
        this.head = null;
    }
    public void addStudent(int rollNumber, String name, int age, String grade, Integer position) {
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        if (position == null) {
            if (head == null) {
                head = newStudent;
            } else {
                StudentNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newStudent;
            }
            return;
        }
        if (position == 0) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        int count = 0;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }
    public void removeStudent(int rollNumber) {
        StudentNode temp = head, prev = null;
        while (temp != null && temp.rollNumber != rollNumber) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
            return;
        }
        if (prev == null) head = temp.next;
        else prev.next = temp.next;
        System.out.println("Student with Roll Number " + rollNumber + " removed.");
    }
    public void searchStudent(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
    public void updateGrade(int rollNumber, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Updated grade for Roll Number " + rollNumber + " to " + newGrade + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
    public void displayStudents() {
        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StudentManagementSystem students = new StudentManagementSystem();
        students.addStudent(1, "Aashi", 20, "A", null);
        students.addStudent(2, "Ayush", 22, "B", null);
        students.addStudent(3, "Akrati", 21, "C", 1);
        students.displayStudents();
        students.removeStudent(2);
        students.displayStudents();
        students.updateGrade(1, "A+");
        students.searchStudent(3);
    }
}
