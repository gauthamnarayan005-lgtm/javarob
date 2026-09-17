class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
    }

    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available: $" + balance + ", Requested: $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn $" + amount + ". Remaining Balance: $" + balance);
    }

    void displayBalance() {
        System.out.println("Account #" + accountNumber + " Balance: $" + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, 500.0);

        try {
            account.deposit(200.0);
            account.withdraw(800.0);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            account.displayBalance();
            System.out.println("Transaction session terminated.");
        }

        System.out.println();

        try {
            account.deposit(-50.0);
        } catch (InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            account.displayBalance();
            System.out.println("Transaction session terminated.");
        }
    }
}
