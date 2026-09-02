class Vehicle {
    String brand = "ford";
    int speed = 0;


    void accelerate(int increment){
        speed += increment;


    }
}
class Car extends Vehicle{
    String modelName ="mustang";
    void triggerturbo(){

    }
}
public class Main {
    public static void main(String[] args){
        Car myCar = new Car();
        Vehicle myVehicle = new Vehicle();
        System.out.println("the vehicle accelerates up to"+myVehicle.speed+"mph");
        System.out.println("the turbo is activated for "+myVehicle.brand+""+myCar.modelName);
        System.out.println("brand:"+myCar.brand);
        myCar.accelerate(60);
        System.out.println("model:"+myCar.modelName);
        myCar.triggerturbo();
    }
}