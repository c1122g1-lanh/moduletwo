package ss_7_abstractclassvsinterface.bai_1;

import java.util.Arrays;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 2);
        Shape[] arrShape = new Shape[2];
        arrShape[0] = circle;
        arrShape[1] = rectangle;
        for (Shape shape : arrShape) {
            if (shape instanceof Circle) {
                System.out.println("area circle before is :" + circle.getArea());
                System.out.println("area circle after is :" + circle.resize(2));
            } else {
                System.out.println("area rectangle before is :" + rectangle.getArea());
                System.out.println("area rectangle after is :" + rectangle.resize(2));
            }
        }
    }
}
