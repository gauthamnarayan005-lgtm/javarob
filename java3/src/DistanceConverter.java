import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        // We use nextDouble() because the input might be a decimal like 2.5
        double kilometers = input.nextDouble();

        // Calculating meters (km * 1000)
        double meters = kilometers * 1000;

        // Calculating centimeters (meters * 100)
        double centimeters = meters * 100;

        // Notice in the PDF example, the output has no decimal points.
        // We can use "Type Casting" to temporarily turn our double into an integer for printing.
        System.out.println("Meters = " + (int)meters);
        System.out.println("Centimeters = " + (int)centimeters);

        input.close();
    }
}
