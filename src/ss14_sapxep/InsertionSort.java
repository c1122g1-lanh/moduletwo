package ss14_sapxep;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu mang : ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("nhap phan tu mang :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        InsertionSort.indertionsort(arr);
        System.out.println("mang sau sap xep :" + Arrays.toString(arr));
    }

    public static void indertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > temp; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = temp;
            System.out.println("buoc " + i + " : " + Arrays.toString(arr));
        }
    }
}
