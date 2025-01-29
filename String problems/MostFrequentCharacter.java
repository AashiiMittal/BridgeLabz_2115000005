import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        char mostFrequentChar = findMostFrequentCharacter(inputString);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        int maxFrequency = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) i;
            }
        }
        return mostFrequentChar;
    }
}
