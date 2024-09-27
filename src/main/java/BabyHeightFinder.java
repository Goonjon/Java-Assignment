import java.util.Scanner;

public class BabyHeightFinder {
    public static void main(String[] args) {
        // Step 1: Create an array to store the heights of 10 babies
        int[] heights = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Step 2: Take input for the heights
        System.out.println("Enter the heights of 10 babies (in cm):");
        for (int i = 0; i < 10; i++) {
            heights[i] = scanner.nextInt();
        }

        // Step 3: Find the lowest height
        int lowest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < lowest) {
                lowest = heights[i];  // Update lowest if a smaller height is found
            }
        }

        // Step 4: Find the second lowest height
        int secondLowest = Integer.MAX_VALUE;  // Start with a large number
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > lowest && heights[i] < secondLowest) {
                secondLowest = heights[i];  // Update secondLowest if it's larger than lowest but smaller than others
            }
        }

        // Step 5: Print the two lowest heights
        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");

        // Close the scanner
        scanner.close();
    }
}



