
import java.util.Random;
public class Main{

    public static void main(String[] args) {
        // 1. Initialize and display the array
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.print("Array values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // 2. Calculate sum and average
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f\n", average);

        // 3. Linear scan (search)
        int userValue1 = SafeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue1) {
                count++;
            }
        }
        System.out.println("The value " + userValue1 + " occurs " + count + " times in the array.");

        int userValue2 = SafeInput.getRangedInt("Enter another integer between 1 and 100: ", 1, 100);
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        // 4. Find minimum and maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        // 5. Calculate average of dataPoints array
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}

