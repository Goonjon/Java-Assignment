public class NoteCounter {
    public static void main(String[] args) {
        // Define the array of notes
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Input: Define the amount you want to break down
        int amount = 546;

        // Loop through the array of notes
        for (int i = 0; i < notes.length; i++) {
            // Count how many times the current note fits into the amount
            if (amount >= notes[i]) {
                int count = amount / notes[i];  // Number of notes
                amount = amount % notes[i];     // Remaining amount after taking out the notes
                // Print the note and how many times it was used
                System.out.println(notes[i] + " " + count);
            }
        }
    }
}
