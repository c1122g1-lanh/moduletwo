package ss_7_abstractclassvsinterface.bai_2;

public class Test {
    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[3];
        shapes[0] = new Circle("red", 3);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Square(3);
        for (Shape1 shape1 : shapes) {
            if (shape1 instanceof Circle) {
                System.out.println("Area circle is : " + shape1.getArea());
                System.out.println("Colorable is : " + ((Circle) shape1).howToColor());
            } else if (shape1 instanceof Square) {
                System.out.println("Area square is : " + shape1.getArea());
                System.out.println("Colorable is : " + ((Square) shape1).howToColor());
            } else {
                System.out.println("Area rectangle is : " + shape1.getArea());
            }
        }
    }
}


