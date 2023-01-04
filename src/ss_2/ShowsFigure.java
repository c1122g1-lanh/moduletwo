package ss_2;

import java.util.Scanner;

public class ShowsFigure {
    static String sao = "*";

    public static void retangular() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(sao);
            }
            System.out.println("");
        }
    }

    public static void triangular() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sao + " ");
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sao + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        retangular();
        triangular();

    }
}
