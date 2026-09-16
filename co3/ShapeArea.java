abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Shape color: " + color);
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape c = new Circle("Red", 5.0);
        c.showColor();
        System.out.println("Circle Area: " + c.calculateArea());

        Shape r = new Rectangle("Blue", 4.0, 6.0);
        r.showColor();
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}
