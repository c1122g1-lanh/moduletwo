package ss_7_abstractclassvsinterface.bai_2;

import ss_7_abstractclassvsinterface.bai_1.Resizeable;
import ss_7_abstractclassvsinterface.bai_1.Shape;

public class Circle extends Shape1 implements Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super.getColor();
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
