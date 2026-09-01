/**
* PROGRAM 2: Calculator Operations
* Topics: Numeric types, Operations, Precedence, Math functions
*/
import java.util.Scanner;

public class Program2_NumericOperations {
    public static void performCalculations() {
        Scanner scanner = new Scanner(System.in);

        // 1. Numeric Literals and Data Types
        int num1 = 25; // Integer literal
        int num2 = 10; // Integer literal
        double pi = 3.14159; // Double literal
        float floatNum = 5.5f; // Float literal (f suffix)
        long longNum = 100000L; // Long literal (L suffix)

        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();

        // 2. Arithmetic Operations
        int sum = num1 + num2; // Addition
        int difference = num1 - num2; // Subtraction
        int product = num1 * num2; // Multiplication
        int quotient = num1 / num2; // Division (integer)
        int remainder = num1 % num2; // Modulus (remainder)

        // 3. Expression with multiple operators (Operator Precedence)
        // * and / before + and -
        int result1 = 10 + 5 * 2; // = 20 (not 30)
        int result2 = (10 + 5) * 2; // = 30 (parentheses change order)
        int result3 = 20 / 5 * 2; // = 8 (left to right)

        // 4. Type Conversion
        double exactQuotient = (double) num1 / num2; // Casting to double

        // 5. Mathematical Functions (Math class)
        double squareRoot = Math.sqrt(25); // Square root
        double power = Math.pow(2, 3); // 2^3 = 8
        double absoluteValue = Math.abs(-15); // 15
        double randomNumber = Math.random(); // 0.0 to 1.0
        int maxValue = Math.max(num1, num2); // Maximum
        int minValue = Math.min(num1, num2); // Minimum

        // 6. Output Results
        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Integer Division: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Exact Division: " + exactQuotient);

        System.out.println("\n--- Expression Precedence ---");
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("20 / 5 * 2 = " + result3);

        System.out.println("\n--- Math Functions ---");
        System.out.println("Square root of 25: " + squareRoot);
        System.out.println("2^3: " + power);
        System.out.println("|-15|: " + absoluteValue);
        System.out.println("Random number: " + randomNumber);
        System.out.println("Max of " + num1 + " and " + num2 + ": " + maxValue);
        System.out.println("Min of " + num1 + " and " + num2 + ": " + minValue);

        scanner.close();
    }

    public static void main(String[] args) {
        performCalculations();
    }
}
