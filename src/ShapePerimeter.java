class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println("Shape Name: " + this.name);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void describe() {
        super.describe(); // Prints the name
        double area = Math.PI * this.radius * this.radius;
        // FIX 1: Print the calculated area here
        System.out.printf("The computed area of the circle: %.2f\n", area);
    }
}

// FIX 2: Move this class outside of the Circle class
public class ShapePerimeter {
    public static void main(String[] args) { // Fixed typo in "args"
        Circle myCircle = new Circle("my cirrr", 5.5);

        // FIX 3: Call the method directly because it handles its own printing
        myCircle.describe();
    }
}
