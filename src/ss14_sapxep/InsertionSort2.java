package ss14_sapxep;

import java.util.Arrays;

public class InsertionSort2 extends InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 3, 1, 6, 9};
        InsertionSort2.indertionsort(arr);
        System.out.println("ket qua la : " + Arrays.toString(arr));

    }
}
