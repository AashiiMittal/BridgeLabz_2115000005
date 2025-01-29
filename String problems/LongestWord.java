import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String longestWord = "";
        int maxLength = 0;
        String currentWord = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.length() > maxLength) {
                    maxLength = currentWord.length();
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > maxLength) {
            longestWord = currentWord;
        }
        System.out.println("The longest word is: " + longestWord);
    }
}
