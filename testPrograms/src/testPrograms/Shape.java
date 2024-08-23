package testPrograms;

abstract public class Shape
{
    protected String color;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }
	
}

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
public class Rectangle extends Shape {
    // Rectangle properties
    private double length;
    private double width;

    // Constructor(s)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Implement abstract methods
    @Override
    public double calculateArea() {
        // Implement area calculation for rectangle
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        // Implement perimeter calculation for rectangle
        return 2 * (length + width);
    }
}


