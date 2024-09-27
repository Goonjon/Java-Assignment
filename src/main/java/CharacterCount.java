import java.util.LinkedHashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "I live in Dhaka".toLowerCase(); // Convert to lowercase

        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        // Loop through characters and count occurrences
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Only consider alphabetic characters
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the result
        for (char c : countMap.keySet()) {
            System.out.println(c + " " + countMap.get(c));
        }
    }
}
