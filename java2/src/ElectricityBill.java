import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the constant. 
        // We use ALL_CAPS as a standard naming convention for constants in Java.
        final double RATE_PER_UNIT = 7.5;

        // Reading the units consumed
        System.out.print("Enter units: ");
        int unitsConsumed = input.nextInt();

        // Calculating the bill
        // Even though unitsConsumed is an int, multiplying it by a double (7.5) 
        // automatically promotes the result to a double.
        double billAmount = unitsConsumed * RATE_PER_UNIT;

        // Displaying the result
        System.out.println("Electricity Bill = " + billAmount);

        input.close();
    }
}
