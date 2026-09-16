abstract class RescueRobot {
    String robotID;
    int battery;

    RescueRobot(String robotID, int battery) {
        this.robotID = robotID;
        this.battery = battery;
    }

    void start() {
        System.out.println(robotID + " Started");
    }

    void shutdown() {
        System.out.println(robotID + " Shutdown");
    }

    abstract void performMission();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climbable {
    void climb();
}

class DroneRobot extends RescueRobot implements Flyable {
    DroneRobot(String id, int battery) {
        super(id, battery);
    }

    @Override
    void performMission() {
        System.out.println("Searching from sky");
    }

    @Override
    public void fly() {
        System.out.println("Drone Flying");
    }
}

class UltimateRescueRobot extends RescueRobot implements Flyable, Swimmable, Climbable {
    UltimateRescueRobot(String id, int battery) {
        super(id, battery);
    }

    @Override
    void performMission() {
        System.out.println("Performing Complete Rescue");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void climb() {
        System.out.println("Climbing");
    }
}

public class robot {
    public static void main(String[] args) {
        RescueRobot robot = new UltimateRescueRobot("R101", 90);
        robot.start();
        robot.performMission();

        Flyable fly = (Flyable) robot;
        fly.fly();

        Swimmable swim = (Swimmable) robot;
        swim.swim();

        Climbable climb = (Climbable) robot;
        climb.climb();

        robot.shutdown();
    }
}
