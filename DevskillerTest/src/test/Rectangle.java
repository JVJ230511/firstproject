package test;

public class Rectangle extends Shape{
	// Rectangle properties
    private double length;
    private double width;

    // Constructor(s)
    public Rectangle(double length, double width) {
    	super.color="blue";
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
