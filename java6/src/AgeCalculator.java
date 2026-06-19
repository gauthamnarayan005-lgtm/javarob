import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading the current year
        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();

        // Reading the birth year
        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();

        // Calculating the age using a simple subtraction expression
        int age = currentYear - birthYear;

        // Displaying the result
        System.out.println("Age = " + age);

        input.close();
    }
}