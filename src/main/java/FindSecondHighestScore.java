public class FindSecondHighestScore {
public static void main(String[] args) {
    double[] numbers = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
    double max = numbers[0];
    double sLargest = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max) {
            sLargest = max;
            max = numbers[i];
        } else if (numbers[i] > sLargest) {
            sLargest = numbers[i];
        }
    }
    System.out.println("Second highest score: " + sLargest);
}
    }


