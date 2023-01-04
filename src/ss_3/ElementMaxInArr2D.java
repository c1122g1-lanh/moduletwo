package ss_3;

import java.util.Scanner;

public class ElementMaxInArr2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter columes : ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter rows : ");
        int m = Integer.parseInt(scanner.nextLine());
        int matrix[][] = new int[n][m];
        System.out.println(" Enter element in matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

        }
        System.out.println("Elenment max is : " + max);
    }
}
