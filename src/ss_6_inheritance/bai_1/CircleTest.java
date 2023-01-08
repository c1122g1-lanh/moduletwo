package ss_6_inheritance.bai_1;

import ss_6_inheritance.bai_1.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "yellow");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        circle1.setRadius(3);
        circle1.setColor("red");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
    }
}
