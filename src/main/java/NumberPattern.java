public class NumberPattern {
    public static void main(String[] args) {
        // First half: decreasing pattern
        for (int i = 5; i >= 1; i--) {  // Loop for number of rows
            for (int j = 1; j <= i; j++) {  // Print numbers from 1 to i
                System.out.print(j);
            }
            System.out.println();  // Move to next line
        }

        // Second half: increasing pattern
        for (int i = 2; i <= 5; i++) {  // Loop for number of rows
            for (int j = 1; j <= i; j++) {  // Print numbers from 1 to i
                System.out.print(j);
            }
            System.out.println();  // Move to next line
        }
    }
}

