package ss_4_oop.fan;

public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private static boolean status = false;
    private static double radius = 5;
    private static String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public Boolean getStatus() {

        return status;
    }

    public void setStatus(boolean status) {

        this.status = status;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String toString() {
        return "Speed is" + getSpeed() + "Radius is" + getRadius() + "color is" + getColor() + (getStatus() ? "fan is on" : "fan is off");
    }
}
