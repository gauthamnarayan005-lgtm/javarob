import java.util.Scanner;

public class DataCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Setting the fixed data limit
        final double DATA_LIMIT = 30.0;

        System.out.print("Enter Data used in GB: ");
        double usedData = input.nextDouble();

        // Calculating what is left
        double remainingData = DATA_LIMIT - usedData;

        // Displaying the results matching the document's example
        System.out.println("Used: " + (int)usedData + " GB");
        System.out.println("Remaining: " + (int)remainingData + " GB");

        input.close();
    }
}