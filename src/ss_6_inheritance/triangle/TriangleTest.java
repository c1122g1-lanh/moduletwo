package ss_6_inheritance.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 4, 3);
        System.out.println(triangle1);
        System.out.println(triangle1.getHaftPerimeter());
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());
        triangle1.setSide1(5);
        triangle1.setSide2(5);
        triangle1.setSide3(5);
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle(2, 2, 3);
        System.out.println(triangle2);
        System.out.println(triangle2.getHaftPerimeter());
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimeter());
    }
}
