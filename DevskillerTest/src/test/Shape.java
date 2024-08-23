package test;

public abstract class Shape {
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
