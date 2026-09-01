/**
* PROGRAM 6: Methods Demonstration
* Topics: Methods, parameters, return values, overloading
*/
import java.util.Scanner;

public class Program6_Methods {
    // 1. Method without parameters and no return
    public static void displayWelcome() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Method with parameters and no return
    public static void displayGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method with parameters and return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 4. Method with multiple parameters
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // 5. Method Overloading (same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // 6. Method returning a String
    public static String getGradeMessage(int marks) {
        if (marks >= 80) return "Excellent";
        else if (marks >= 60) return "Good";
        else if (marks >= 40) return "Average";
        else return "Needs Improvement";
    }

    // 7. Method with boolean return
    public static boolean isEligible(int age) {
        return age >= 18;
    }

    // 8. Method calling other methods
    public static void processStudent(int marks, String name) {
        displayGreeting(name);
        String grade = getGradeMessage(marks);
        System.out.println(name + " has grade: " + grade);
        if (isEligible(18)) {
            System.out.println(name + " is eligible for college.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calling methods
        displayWelcome();
        System.out.println();

        // Method with parameters
        displayGreeting("Amir Ali");
        System.out.println();

        // Method with return value
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        // Method with multiple parameters
        double avg = calculateAverage(85.5, 90.0, 78.5);
        System.out.println("Average: " + avg);
        System.out.println();

        // Method Overloading
        System.out.println("Method Overloading Examples:");
        System.out.println("Multiply(5, 3): " + multiply(5, 3));
        System.out.println("Multiply(5, 3, 2): " + multiply(5, 3, 2));
        System.out.println("Multiply(5.5, 3.2): " + multiply(5.5, 3.2));
        System.out.println();

        // Method returning string
        System.out.println("Enter marks to get grade: ");
        int marks = scanner.nextInt();
        String grade = getGradeMessage(marks);
        System.out.println("Grade: " + grade);

        // Method with boolean return
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (isEligible(age)) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        System.out.println();

        // Method calling other methods
        processStudent(85, "Ahmed");

        scanner.close();
    }
}
