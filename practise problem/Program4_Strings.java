/**
* PROGRAM 4: String Manipulation
* Topics: Strings, String methods, Named Constants
*/
import java.util.Scanner;

public class Program4_Strings {
    public static void manipulateStrings() {
        Scanner scanner = new Scanner(System.in);

        // Named Constants (using final)
        final String COLLEGE_NAME = "ABC Institute of Technology";
        final int MAX_NAME_LENGTH = 50;
        final double DEFAULT_SALARY = 25000.00;
        final char GRADE_A = 'A';
        final String DEFAULT_COUNTRY = "India";

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        // String Methods
        // 1. Length
        int nameLength = fullName.length();

        // 2. Case conversion
        String upperName = fullName.toUpperCase();
        String lowerName = fullName.toLowerCase();

        // 3. Checking if empty or blank
        boolean isEmpty = fullName.isEmpty();
        boolean isBlank = fullName.isBlank();

        // 4. Character at position
        char firstChar = fullName.charAt(0);
        char lastChar = fullName.charAt(fullName.length() - 1);

        // 5. Substring
        String firstName = fullName.substring(0, fullName.indexOf(' '));
        String lastName = fullName.substring(fullName.indexOf(' ') + 1);

        // 6. Contains
        boolean hasNumber = fullName.matches(".*\\d.*");

        // 7. Email validation
        boolean hasAtSymbol = email.contains("@");
        boolean hasDotCom = email.endsWith(".com") || email.endsWith(".in");

        // 8. Replacing characters
        String maskedPhone = phone.replaceAll("\\d", "X");

        // 9. Comparing strings
        boolean isEqual = fullName.equals("John Doe");
        boolean isEqualIgnoreCase = fullName.equalsIgnoreCase("john doe");

        // 10. Trimming spaces
        String trimmedName = fullName.trim();

        // 11. Splitting string
        String[] nameParts = fullName.split(" ");

        // Output
        System.out.println("\n" + "=".repeat(60));
        System.out.println("COLLEGE: " + COLLEGE_NAME);
        System.out.println("=".repeat(60));
        System.out.println("Name Details:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Name Length: " + nameLength);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Uppercase: " + upperName);
        System.out.println("Lowercase: " + lowerName);
        System.out.println("Trimmed: '" + trimmedName + "'");
        System.out.println("Contains numbers: " + hasNumber);
        System.out.println("Empty? " + isEmpty);
        System.out.println("Blank? " + isBlank);

        System.out.println("\nEmail: " + email);
        System.out.println("Valid email format: " + (hasAtSymbol && hasDotCom));

        System.out.println("\nPhone: " + phone);
        System.out.println("Masked Phone: " + maskedPhone);

        System.out.println("\nName Parts:");
        for (int i = 0; i < nameParts.length; i++) {
            System.out.println("Part " + (i+1) + ": " + nameParts[i]);
        }

        System.out.println("\nConstants Used:");
        System.out.println("Default Salary: " + DEFAULT_SALARY);
        System.out.println("Default Country: " + DEFAULT_COUNTRY);
        System.out.println("Grade: " + GRADE_A);

        scanner.close();
    }

    public static void main(String[] args) {
        manipulateStrings();
    }
}
