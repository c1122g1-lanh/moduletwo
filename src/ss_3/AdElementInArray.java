package ss_3;

import java.util.Arrays;
import java.util.Scanner;

public class AdElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5};
        int newArray[] = new int[array.length + 1];
        System.out.println("nhap so can them :");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap  vi tri can chan :");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index >= array.length - 1) {
            System.out.println("vuot qua gioi han mang ");
        } else {
            int i;
            for (i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = number;
            for (i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}

