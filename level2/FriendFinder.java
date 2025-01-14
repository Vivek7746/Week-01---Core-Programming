import java.util.Scanner;

public class FriendFinder {

    // Method to find the youngest friend based on age
    public static String findYoungestFriend(int[] ages, String[] names) {
		
        // Assuming Amar is the youngest initially
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        // Loop through the ages array to find the youngest friend
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        return youngestFriend;
    }

    // Method to find the tallest friend based on height
    public static String findTallestFriend(double[] heights, String[] names) {
		
        // Assuming Amar is the tallest initially
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        // Loop through the heights array to find the tallest friend
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the ages and heights of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in meters): ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        String youngest = findYoungestFriend(ages, names);
        System.out.println("The youngest friend is: " + youngest);

        // Find the tallest friend
        String tallest = findTallestFriend(heights, names);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner
        scanner.close();
    }
}
