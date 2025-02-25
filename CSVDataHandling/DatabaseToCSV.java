import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
public class DatabaseToCSV {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database"; // Change to your DB
        String username = "your_username"; // Change to your username
        String password = "your_password"; // Change to your password
        String csvFile = "employees_report.csv";
        String query = "SELECT EmployeeID, Name, Department, Salary FROM employees";
        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Employee ID,Name,Department,Salary\n");
            while (rs.next()) {
                writer.append(rs.getInt("EmployeeID") + ",");
                writer.append(rs.getString("Name") + ",");
                writer.append(rs.getString("Department") + ",");
                writer.append(rs.getDouble("Salary") + "\n");
            }
            System.out.println("CSV report generated successfully: " + csvFile);
        } catch (SQLException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
