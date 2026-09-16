abstract class Order {
    String orderId;
    String customerName;
    double amount;

    Order(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Amount: $" + amount);
    }

    abstract void processOrder();
}

interface Discountable {
    double applyDiscount(double percentage);
}

interface Trackable {
    void trackDeliveryStatus();
}

class DigitalOrder extends Order implements Discountable {
    String downloadLink;

    DigitalOrder(String orderId, String customerName, double amount, String downloadLink) {
        super(orderId, customerName, amount);
        this.downloadLink = downloadLink;
    }

    @Override
    void processOrder() {
        System.out.println("Generating download link: " + downloadLink);
    }

    @Override
    public double applyDiscount(double percentage) {
        amount = amount - (amount * percentage / 100);
        return amount;
    }
}

class PhysicalOrder extends Order implements Discountable, Trackable {
    String deliveryAddress;
    String trackingNumber;

    PhysicalOrder(String orderId, String customerName, double amount, String deliveryAddress, String trackingNumber) {
        super(orderId, customerName, amount);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }

    @Override
    void processOrder() {
        System.out.println("Packing item for shipment to " + deliveryAddress);
    }

    @Override
    public double applyDiscount(double percentage) {
        amount = amount - (amount * percentage / 100);
        return amount;
    }

    @Override
    public void trackDeliveryStatus() {
        System.out.println("Tracking #" + trackingNumber + ": Package in transit to " + deliveryAddress);
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        DigitalOrder ebook = new DigitalOrder("ORD-D10", "John", 40.0, "https://books.com/dl/10");
        ebook.applyDiscount(10);
        ebook.showOrderDetails();
        ebook.processOrder();

        System.out.println();

        PhysicalOrder laptop = new PhysicalOrder("ORD-P20", "Emma", 1200.0, "42 Main Street, NY", "TRK987654");
        laptop.applyDiscount(5);
        laptop.showOrderDetails();
        laptop.processOrder();
        laptop.trackDeliveryStatus();
    }
}
