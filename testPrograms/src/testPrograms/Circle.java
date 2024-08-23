package testPrograms;

public class Circle extends Shape {
    // Circle properties
    private double radius;

    // Constructor(s)
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods
    @Override
    public double calculateArea() {
        // Implement area calculation for circle
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // Implement perimeter calculation for circle
        return 2* Math.PI * radius;
    }
}