public class CalculateTotalCost {
    public static void main(String[] args) {
        String input = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";

        // Step 1: Extract digits from the paragraph
        String digitsOnly = input.replaceAll("[^0-9]", " ");  // Remove non-digit characters
        String[] numbers = digitsOnly.trim().split("\\s+");   // Split by spaces

        // Step 2: Parse the extracted numbers
        int laptopPrice = Integer.parseInt(numbers[0]); // 85000
        int mousePrice = Integer.parseInt(numbers[1]);  // 2500

        // Step 3: Calculate total cost before discount
        int totalCost = laptopPrice + mousePrice;

        // Step 4: Apply 15% discount
        double discount = totalCost * 0.15;
        double finalCost = totalCost - discount;

        // Step 5: Print the final cost
        System.out.printf("Total cost after 15%% discount: %.2f tk\n", finalCost);
    }
}
