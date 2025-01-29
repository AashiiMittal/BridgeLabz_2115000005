import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace:");
        String wordToReplace = sc.nextLine();
        System.out.println("Enter the replacement word:");
        String replacementWord = sc.nextLine();
        String modifiedSentence = replace(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
    public static String replace(String sentence, String wordToReplace, String replacementWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                result.append(replacementWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
