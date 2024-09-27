public class SortCGPA {
    public static void main(String[] args) {
        // Array of CGPAs
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        // Selection sort to sort the CGPAs in descending order
        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] < cgpa[j]) {
                    // Swap to sort in descending order
                    double temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }

        // Print the CGPAs after sorting in descending order
        System.out.println("CGPAs sorted in descending order:");
        for (int i = 0; i < cgpa.length; i++) {
            System.out.println(cgpa[i]);
        }
    }
}

