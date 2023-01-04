package ss_3;

import java.util.Scanner;
import java.lang.String;

public class CountOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "nguyenminhlanh";
        System.out.println("Enter char : ");
        char char1 = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (char1 == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Chars advent in string is  : " + count);
    }
}
