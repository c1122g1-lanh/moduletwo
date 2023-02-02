package ss_13_timkiem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BinarySeach {
    public static int binarySeach(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;
        if (value == arr[middle]) {
            return value;
        } else if (value < arr[middle]) {
            return binarySeach(arr, left, middle - 1, value);
        } else {
            return binarySeach(arr, middle + 1, right, value);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap do dai mang : ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("nhap phan tu mang :");
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("nhap so can tim");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("mang duoc sap xep" + Arrays.toString(arr));
        System.out.println("ket qua " + BinarySeach.binarySeach(arr, 0, number - 1, value));
    }
}
