import java.util.HashSet;

public class StringCounter {
    public static void main(String[] args) {
        // Step 1: Initialize the string
        String myStr = "I am a SQA Engineer";

        // Step 2: Initialize variables
        String vowels = "aeiou";
        int vowelCount = 0;
        int consonantCount = 0;
        int charCount = 0;
        HashSet<Character> uniqueVowels = new HashSet<>();  // For unique vowels

        // Step 3: Convert the string to lowercase and process each character
        char[] chars = myStr.toLowerCase().toCharArray();

        for (char c : chars) {
            if (c != ' ') {  // Count characters excluding spaces
                charCount++;

                // Check if the character is a vowel
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                    uniqueVowels.add(c);  // Add vowel to the HashSet
                }
                // Check if the character is a consonant (it must be a letter, not space or symbol)
                else if (Character.isLetter(c)) {
                    consonantCount++;
                }
            }
        }

        // Step 4: Count the number of words
        String[] words = myStr.split("\\s+");
        int wordCount = words.length;

        // Step 5: Print the results
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}


