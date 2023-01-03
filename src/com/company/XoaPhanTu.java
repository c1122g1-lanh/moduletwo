package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int cout, i;
        Scanner scanner = new Scanner(System.in);
        int myArr[] = {1, 2, 3, 4, 3, 6, 7};
        System.out.println(Arrays.toString(myArr));
        System.out.println("nhap so can kiem tra : ");
        int number = Integer.parseInt(scanner.nextLine());
        int myArr1[] = new int[myArr.length];
        for (cout = i = 0; i < myArr.length; i++) {
            if (number != myArr[i]) {
                myArr1[cout] = myArr[i];
                cout++;
            }
        }
        int index = 0;
        for (int k = 0; k < myArr1.length; k++) {
            if(myArr1[k] != 0) {
                myArr1[index++] = myArr1[k];
            }
        }
        System.out.println(Arrays.toString(myArr1));
        }
    }

