package ss_5_accessmodifier.bai_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double area = 0;
        final double PI = 3.14;
        return area = radius * radius * PI;
    }
}
