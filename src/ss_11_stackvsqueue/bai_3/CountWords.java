package ss_11_stackvsqueue.bai_3;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        TreeMap<String, Integer> strTree = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string need counts :");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        String[] strArr = str.split("");
        for (int i =0; i< strArr.length;i++){

        }
        System.out.println(strTree);

    }

}
