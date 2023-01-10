package ss_7_abstractclassvsinterface.bai_2;

public class Test {
    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[2];
        shapes[0] = new Circle("red", 3);
        shapes[1] = new Rectangle(3, 3);
        for (Shape1 shape1 : shapes) {
            if (shape1 instanceof Circle) {
                System.out.println("area circle is : " + ((Circle) shape1).getArea());
                System.out.println("Colorable is : " + ((Circle) shape1).howToColor());
            } else {
                System.out.println("area rectangle is : " + ((Rectangle) shape1).getArea());
            }
        }
    }
}


