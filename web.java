import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition
        double result = num1 + num2;

        // Display the result
        System.out.println("The result of addition is: " + result);

        // Close the scanner
        scanner.close();
    }
}
