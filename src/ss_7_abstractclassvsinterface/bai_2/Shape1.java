package ss_7_abstractclassvsinterface.bai_2;

public abstract class Shape1 {
    private String color = "green";

    public Shape1() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }
}

