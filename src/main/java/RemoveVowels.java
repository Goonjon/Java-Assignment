public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer".toLowerCase(); // Convert to lowercase
        StringBuilder output = new StringBuilder();

        // Loop through each character and remove vowels
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) { // Check if the character is not a vowel
                output.append(c);
            }
        }

        // Remove extra spaces and print the result
        System.out.println(output.toString().trim().replaceAll("\\s+", " "));
    }
}
