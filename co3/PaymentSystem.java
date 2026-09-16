abstract class Payment {
    double amount;
    String transactionId;

    Payment(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    void printReceipt() {
        System.out.println("Transaction ID: " + transactionId + ", Amount: $" + amount);
    }

    abstract void processPayment();
}

interface Refundable {
    void processRefund();
}

class CreditCardPayment extends Payment implements Refundable {
    String cardNumber;

    CreditCardPayment(double amount, String transactionId, String cardNumber) {
        super(amount, transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void processRefund() {
        System.out.println("Refunding $" + amount + " to card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class UPIPayment extends Payment implements Refundable {
    String upiId;

    UPIPayment(double amount, String transactionId, String upiId) {
        super(amount, transactionId);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI payment of $" + amount + " via " + upiId);
    }

    @Override
    public void processRefund() {
        System.out.println("Refunding $" + amount + " to UPI ID " + upiId);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment card = new CreditCardPayment(150.0, "TXN1001", "1234567890123456");
        card.printReceipt();
        card.processPayment();
        card.processRefund();

        System.out.println();

        UPIPayment upi = new UPIPayment(50.0, "TXN1002", "user@upi");
        upi.printReceipt();
        upi.processPayment();
        upi.processRefund();
    }
}
