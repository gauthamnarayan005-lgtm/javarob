/**
* PROGRAM 7: Arrays Demonstration
* Topics: Arrays, array operations, for-each loop
*/
import java.util.Scanner;

public class Program7_Arrays {
    public static void demonstrateArrays() {
        Scanner scanner = new Scanner(System.in);

        // 1. Array Declaration and Initialization
        // Method 1: Declaration and then initialization
        int[] numbers = new int[5];

        // Method 2: Declaration and initialization together
        int[] scores = {85, 90, 78, 92, 88};

        // Method 3: Using new keyword with values
        String[] names = new String[]{"Alice", "Bob", "Charlie"};

        // 2. Accessing array elements
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[scores.length - 1]);

        // 3. Taking input for array
        System.out.println("\nEnter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // 4. Printing array using for loop
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 5. Using enhanced for loop (for-each)
        System.out.println("\nScores using for-each:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // 6. Common array operations
        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of numbers: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);

        // Find max
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        System.out.println("Maximum: " + max);

        // Find min
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
        }
        System.out.println("Minimum: " + min);

        // 7. Array of Strings
        System.out.println("\nEnter 3 names:");
        String[] studentNames = new String[3];
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Name " + (i+1) + ": ");
            studentNames[i] = scanner.nextLine();
            if (studentNames[i].isEmpty()) {
                studentNames[i] = scanner.nextLine(); // Handle empty input
            }
        }
        System.out.println("\nStudent Names:");
        for (String name : studentNames) {
            System.out.println("- " + name);
        }

        // 8. Searching in array
        System.out.print("\nEnter a number to search: ");
        int search = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Found at position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found!");
        }

        // 9. Copying arrays
        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        System.out.println("Array copied successfully!");

        // 10. Reverse array
        System.out.print("\nReversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void main(String[] args) {
        demonstrateArrays();
    }
}
