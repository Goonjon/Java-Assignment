public class RandomNumberMaxMin {
    public static void main(String[] args) {
        // Step 1: Define an array to store 10 random integers
        int[] numbers = new int[10];

        // Step 2: Set the range for the random numbers (e.g., between 100 and 200)
        int min = 10;
        int max = 200;

        // Step 3: Generate 10 random integers within the range and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        // Step 4: Print all the generated numbers
        System.out.println("Generated random numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();  // Line break for clarity

        // Step 5: Initialize variables to find max and min
        int maxNum = numbers[0];
        int minNum = numbers[0];

        // Step 6: Loop through the array to find the max and min numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];  // Update max if current number is larger
            }
            if (numbers[i] < minNum) {
                minNum = numbers[i];  // Update min if current number is smaller
            }
        }

        // Step 7: Print the max and min values
        System.out.println("Maximum number: " + maxNum);
        System.out.println("Minimum number: " + minNum);
    }
}
