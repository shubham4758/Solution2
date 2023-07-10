2.// Solution


// Superclass Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Class ShapeCalculator
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

// Main class to demonstrate polymorphism
public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Shape rectangle = new Rectangle(5, 3);
        calculator.printArea(rectangle);  // Output: The area of the shape is: 15.0

        Shape circle = new Circle(4);
        calculator.printArea(circle);     // Output: The area of the shape is: 50.26548245743669

        Shape triangle = new Triangle(6, 8);
        calculator.printArea(triangle);   // Output: The area of the shape is: 24.0
    }
}
