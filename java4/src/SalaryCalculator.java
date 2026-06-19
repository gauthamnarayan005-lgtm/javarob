import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining our percentage rates as fixed constants
        final double DA_RATE = 0.20;
        final double HRA_RATE = 0.10;

        System.out.print("Enter basic salary: ");
        // Using double just in case someone enters a decimal salary
        double basicSalary = input.nextDouble();

        // Calculating the allowances
        double da = basicSalary * DA_RATE;
        double hra = basicSalary * HRA_RATE;

        // Calculating the final gross salary
        double grossSalary = basicSalary + da + hra;

        // Printing the results. 
        // I am casting to (int) here so the output matches the clean numbers in your example!
        System.out.println("DA = " + (int)da);
        System.out.println("HRA = " + (int)hra);
        System.out.println("Gross Salary = " + (int)grossSalary);

        input.close();
    }
}
