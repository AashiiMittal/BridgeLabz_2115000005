import java.util.Scanner;
public class FriendsComparison {
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    public static int findTallest(int[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        System.out.println("Enter the age and height of the friends:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ":");
            ages[i] = sc.nextInt();
            System.out.println("Enter height (in cm) of " + friends[i] + ":");
            heights[i] = sc.nextInt();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        System.out.println("Youngest friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
