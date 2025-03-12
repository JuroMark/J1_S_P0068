package utils;

import java.util.Scanner;

/**
 * The Validate class provides static methods for input validation.
 */
public class Validate {
    public static final Scanner sc = new Scanner(System.in);

    /**
     * Prompts the user to enter a string that matches the specified regex pattern.
     *
     * @param prompt       The prompt message to display.
     * @param regex        The regular expression the input must match.
     * @param errorInvalid The error message for invalid input.
     * @param errorEmpty   The error message for empty input.
     * @return A valid string that matches the regex.
     */
    public static String getString(String prompt, String regex, String errorInvalid, String errorEmpty) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(errorEmpty);
            } else if (!input.matches(regex)) {
                System.out.println(errorInvalid);
            } else {
                return input;
            }
        }
    }

    /**
     * Prompts the user to enter a double value within the specified range.
     *
     * @param prompt             The prompt message to display.
     * @param errorOutOfRange    The error message when the value is out of range.
     * @param errorInvalidNumber The error message for an invalid number format.
     * @param errorEmpty         The error message for empty input.
     * @param min                The minimum acceptable value.
     * @param max                The maximum acceptable value.
     * @return A valid double value within the specified range.
     */
    public static double getDouble(String prompt, String errorOutOfRange,
            String errorInvalidNumber, String errorEmpty, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println(errorEmpty);
                    continue;
                }
                double number = Double.parseDouble(input);
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(errorOutOfRange);
            } catch (NumberFormatException e) {
                System.out.println(errorInvalidNumber);
            }
        }
    }

    /**
     * Retrieves a simple string from the user.
     *
     * @param prompt The prompt message to display.
     * @return The entered string.
     */
    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
}