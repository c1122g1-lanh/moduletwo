package ss_3;

import java.util.Scanner;

public class ElementMinInArr2D {
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
        int min = matrix1[0][0];
        for (int i = 0; i > matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] > min) {
                    min = matrix1[i][j];
                }
            }

        }
        System.out.println("Elenment max is : " + min);
    }
}

