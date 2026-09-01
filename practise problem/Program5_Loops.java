/**
* PROGRAM 5: Loops Demonstration
* Topics: for, while, do-while, nested loops, break, continue
*/
import java.util.Scanner;

public class Program5_Loops {
    public static void demonstrateLoops() {
        Scanner scanner = new Scanner(System.in);

        // 1. for loop - Print numbers 1 to 10
        System.out.println("1. FOR LOOP: Numbers 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. while loop - Sum of numbers until user enters 0
        System.out.println("2. WHILE LOOP: Sum numbers (enter 0 to stop)");
        int sum = 0;
        int number = -1;
        while (number != 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Total Sum: " + sum + "\n");

        // 3. do-while loop - Menu system
        System.out.println("3. DO-WHILE LOOP: Menu System");
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: System.out.println("Hello! Welcome!"); break;
                case 2: System.out.println("Goodbye! See you later!"); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        // 4. Nested loops - Pattern printing
        System.out.println("\n4. NESTED LOOP: Pattern Printing");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5. break statement
        System.out.println("\n5. BREAK: Find first number divisible by 7");
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("First number divisible by 7 is: " + i);
                break;
            }
        }

        // 6. continue statement
        System.out.println("\n6. CONTINUE: Print odd numbers only");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 7. Infinite loop with break condition
        System.out.println("\n7. INFINITE LOOP with break");
        int count = 0;
        while (true) {
            System.out.print("Enter a number (or -1 to exit): ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            count++;
        }
        System.out.println("You entered " + count + " numbers.");

        // 8. for-each style (enhanced for loop)
        System.out.println("\n8. ENHANCED FOR LOOP");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void main(String[] args) {
        demonstrateLoops();
    }
}
