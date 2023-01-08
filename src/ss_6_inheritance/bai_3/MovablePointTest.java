package ss_6_inheritance.bai_3;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2);
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint1);
        System.out.println("move is " + Arrays.toString(movablePoint.getMove()));
    }
}
