class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    WeakPasswordException(String message) {
        super(message);
    }
}

class UserValidator {
    static void validateUser(String username, int age, String password) throws InvalidAgeException, WeakPasswordException {
        if (age < 18) {
            throw new InvalidAgeException("Registration failed: User must be at least 18 years old.");
        }
        if (password.length() < 8) {
            throw new WeakPasswordException("Registration failed: Password must be at least 8 characters long.");
        }
        System.out.println("Registration successful for user: " + username);
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        try {
            UserValidator.validateUser("john_doe", 16, "Pass1234");
        } catch (InvalidAgeException | WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Registration attempt 1 processed.");
        }

        System.out.println();

        try {
            UserValidator.validateUser("emma_w", 22, "123");
        } catch (InvalidAgeException | WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Registration attempt 2 processed.");
        }

        System.out.println();

        try {
            UserValidator.validateUser("alex_k", 25, "SecurePass2026");
        } catch (InvalidAgeException | WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Registration attempt 3 processed.");
        }
    }
}
