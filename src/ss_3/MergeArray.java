package ss_3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length array1 : ");
        int n = Integer.parseInt(scanner.nextLine());
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at index : " + i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter length array2 : ");
        int m = Integer.parseInt(scanner.nextLine());
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter element at index : " + i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int arr3[] = new int[m + n];
        int i;
        for (i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i] = arr2[j];
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

}

