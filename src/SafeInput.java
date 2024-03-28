import java.util.Scanner;

public class SafeInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int getRangedInt(String prompt, int min, int max) {
        int value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print(prompt);
                scanner.next();
            }
            value = scanner.nextInt();
            if (value < min || value > max) {
                System.out.println("Input out of range. Please enter an integer between " + min + " and " + max + ".");
            }
        } while (value < min || value > max);
        return value;
    }
}

