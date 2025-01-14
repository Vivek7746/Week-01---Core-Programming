import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        // Generate random 4-digit numbers and populate the array
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Return the average, min, and max in a new array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
		
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
