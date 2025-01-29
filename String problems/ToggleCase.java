import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        String toggledString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                toggledString += (char) (ch - 'a' + 'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                toggledString += (char) (ch - 'A' + 'a');
            } else {
                toggledString += ch;
            }
        }
        System.out.println("Toggled case string: " + toggledString);
    }
}
