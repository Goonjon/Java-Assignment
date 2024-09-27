import java.util.LinkedHashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>(); // Stores unique elements
        LinkedHashSet<Integer> duplicateSet = new LinkedHashSet<>(); // Tracks duplicates

        // Traverse through the array
        for (int num : numbers) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num); // Add to uniqueSet if it's not already there
            } else {
                duplicateSet.add(num); // If it was in uniqueSet, it's a duplicate
            }
        }

        // Remove all duplicate numbers from uniqueSet
        uniqueSet.removeAll(duplicateSet);

        // Print the result
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
    }
}



//alternative easier way for future practice
//public class UniqueNumbers {
//    public static void main(String[] args) {
//        // Step 1: Initialize the array of numbers
//        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
//
//        // Step 2: Create an array to count occurrences
//        int[] count = new int[100];  // Assuming numbers are between 0 and 99
//
//        // Step 3: Count occurrences of each number
//        for (int number : numbers) {
//            count[number]++;
//        }
//
//        // Step 4: Print numbers that appear only once
//        System.out.println("Non-duplicate numbers:");
//        for (int number : numbers) {
//            if (count[number] == 1) {
//                System.out.print(number + " ");
//            }
//        }
//    }
//}
//
