package ss_3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 5, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so can xoa: ");
        int value = scanner.nextInt();
        int[] newArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                newArray[count] = array[i];
                count++;
            }
        }
        System.out.print("mang sau khi xoa: ");
        for (int i = 0; i < count; i++) {
            System.out.print(newArray[i] + ",");
        }
        System.out.println();
    }
}


