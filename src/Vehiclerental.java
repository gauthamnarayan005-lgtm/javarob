class Vehicle1 {
    String registration;
    double rate;
    public Vehicle1(String registration,double rate){
        this.registration = registration;
        this.rate = rate;

    }
    public double calculateRentalCost(int days) {
        return this.rate * days;
    }

}
class Car1 extends Vehicle1{
    int doors;
    public Car1(String registration,double rate,int doors){
        super(registration,rate);
        this.doors = doors;
    }
    @Override
    public double calculateRentalCost(int days){
        double basePrice = super.calculateRentalCost(days);
        return basePrice + 200;


    }
}
public class Vehiclerental {
    public static void main(String[] args){
        Car1 myCar = new Car1("KL 06 7225",1500,3);
        System.out.println("rental rate of the car:"+myCar.registration+"  is:"+myCar.calculateRentalCost(3)+" and has "+myCar.doors+" doors");

    }
}
