import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Setting up our fixed percentages as constants
        final double GST_RATE = 0.05;
        final double SERVICE_CHARGE_RATE = 0.10;

        System.out.print("Enter food cost: ");
        double foodCost = input.nextDouble();

        // Calculating the specific charge amounts
        double gstAmount = foodCost * GST_RATE;
        double serviceAmount = foodCost * SERVICE_CHARGE_RATE;

        // Calculating the total
        double totalBill = foodCost + gstAmount + serviceAmount;

        // Outputting the results. 
        // Casting to (int) so it matches your document's clean output example of 575!
        System.out.println("GST = " + (int)gstAmount);
        System.out.println("Service Charge = " + (int)serviceAmount);
        System.out.println("Final Bill = " + (int)totalBill);

        input.close();
    }
}