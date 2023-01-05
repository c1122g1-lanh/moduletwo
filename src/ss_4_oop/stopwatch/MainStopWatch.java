package ss_4_oop.stopwatch;

import java.util.Scanner;

public class MainStopWatch {
    public static int min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter columes : ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rows : ");
        int m = Integer.parseInt(scanner.nextLine());
        int matrix1[][] = new int[n][m];
        System.out.println(" Enter element in matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int min = matrix1[0][0];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] < min) {
                    min = matrix1[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Nhap \"start\" to begin count milisecond !!");
        System.out.println(stopWatch.start());
        System.out.println(min());
        System.out.println("Nhap \"start\" to end count milisecond !!");
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
