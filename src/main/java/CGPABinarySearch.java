import java.util.Scanner;

public class CGPABinarySearch {
    public static void main(String[] args) {
        // Array of 10 students' CGPAs
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        // Step 1: Sort the array in ascending order (binary search needs a sorted array)
        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - 1 - i; j++) {
                if (cgpa[j] > cgpa[j + 1]) {
                    // Swap to sort in ascending order
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }

        // Step 2: Get user input for the CGPA to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double targetCGPA = scanner.nextDouble();

        // Step 3: Binary search
        int left = 0;
        int right = cgpa.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (cgpa[mid] == targetCGPA) {
                found = true;
                System.out.println("CGPA " + targetCGPA + " found at position " + mid + " in the sorted array.");
                break;
            } else if (cgpa[mid] < targetCGPA) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1;  // Search in the left half
            }
        }

        // Step 4: If not found, inform the user
        if (!found) {
            System.out.println("CGPA " + targetCGPA + " not found.");
        }

        scanner.close();
    }
}
