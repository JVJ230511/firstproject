package testPrograms;

public class Triangle extends Shape {
    // Triangle properties
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor(s)
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Implement abstract methods
    @Override
    public double calculateArea() {
        // Implement area calculation for triangle
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() 
    {
        // Implement perimeter calculation for triangle
        return side1 + side2 + side3;
    }
}
