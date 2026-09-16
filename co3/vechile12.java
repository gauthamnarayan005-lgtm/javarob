abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }

    abstract void startEngine();
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts using a key or push button.");
    }
}

public class vechile12 {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.displayBrand();
        c.startEngine();
    }
}
