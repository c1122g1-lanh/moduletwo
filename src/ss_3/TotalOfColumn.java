package ss_3;

import java.util.Arrays;
import java.util.Scanner;

public class TotalOfColumn {
    public static void main(String[] args) {
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
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println("Enter column want calculate : ");
        int col = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix1[i][col];
        }
        System.out.println("Total of column is : " + sum);
    }

}


