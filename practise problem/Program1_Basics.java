/**
* PROGRAM 1: My First Java Program
* Topics: Java structure, Console input/output, Variables, Assignment
*/
import java.util.Scanner;

public class Program1_Basics {
    // Method to demonstrate basic concepts
    public static void demonstrateBasics() {
        // 1. Create Scanner for reading input from console
        Scanner scanner = new Scanner(System.in);

        // 2. Variable Declaration and Assignment
        // Variable names follow camelCase naming convention
        String studentName; // Declaration
        int studentAge; // Declaration
        double studentMarks; // Declaration

        // 3. Reading Input from Console
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine(); // Assignment statement

        System.out.print("Enter your age: ");
        studentAge = scanner.nextInt(); // Reading integer

        System.out.print("Enter your marks (out of 100): ");
        studentMarks = scanner.nextDouble(); // Reading double

        // 4. Expressions and Operations
        double percentage = (studentMarks / 100) * 100; // Expression
        boolean isPassing = studentMarks >= 40; // Boolean expression

        // 5. Output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Passing Status: " + isPassing);

        scanner.close();
    }

    public static void main(String[] args) {
        demonstrateBasics(); // Function call only in main
    }
}
