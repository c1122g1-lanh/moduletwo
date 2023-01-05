package ss_4_oop.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        Fan fan1 = new Fan(3, true, 10.0, "yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2, false, 5.0, "blue");
        System.out.println(fan2);
    }
}
