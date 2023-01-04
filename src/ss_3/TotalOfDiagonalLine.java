package ss_3;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter columes and rows : ");
        int n = Integer.parseInt(scanner.nextLine());
        int matrix1[][] = new int[n][n];
        System.out.println(" Enter element in matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    sum += matrix1[i][j];
                }
            }
        }
        System.out.println("Total of diagonalline  is : " + sum);
    }
}
