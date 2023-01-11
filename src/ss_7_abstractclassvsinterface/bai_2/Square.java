package ss_7_abstractclassvsinterface.bai_2;

public class Square extends Shape1 implements IColorable {
    private double size = 0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    public double getPerimeter() {
        return 2 * this.size;
    }

    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }
}
