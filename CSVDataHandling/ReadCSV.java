import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.*;
public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\Desktop\\CSV_Data_Handling\\src\\main\\students.csv";
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println("ID: " + nextLine[0] + ", Name: " + nextLine[1]);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
