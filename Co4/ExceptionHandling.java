public class ExceptionHandling {
    static void checkEligibility(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied: Age must be at least 18.");
        }
        System.out.println("Access granted: Eligible for voting.");
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(20, 4));
            checkEligibility(16);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Cleanup completed.");
        }

        System.out.println();

        try {
            checkEligibility(22);
            System.out.println("Result: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: Resource closed.");
        }
    }
}
