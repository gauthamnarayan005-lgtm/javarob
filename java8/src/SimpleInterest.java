import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the default rate as a constant
        final double DEFAULT_RATE = 5.0;

        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        // Calculating interest using the formula
        // Note: Java follows standard order of operations (PEMDAS)
        double interest = (principal * DEFAULT_RATE * time) / 100.0;

        // Casting to int to match the clean output from your document
        System.out.println("Interest = " + (int)interest);

        input.close();
    }
}