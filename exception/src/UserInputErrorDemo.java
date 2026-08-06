import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputErrorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            int currentYear= LocalDate.now().getYear();
            int year = currentYear-age;

            System.out.println("Your year of birth is: " + year);
        }
        catch (InputMismatchException e) {
            //   catch (Exception e) {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}
