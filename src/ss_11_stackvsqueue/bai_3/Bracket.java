package ss_11_stackvsqueue.bai_3;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void Bracket(String char1) {
        String[] arr = char1.split("");
        Stack<String> bStack = new Stack<>();
        String symRight = ")";
        String symLeft = "(";
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(symLeft)) {
                bStack.push(symLeft);
            } else if (arr[i].equals(symRight)) {
                if (bStack.empty()) {
                    flag = false;
                    break;
                } else {
                    bStack.pop();
                }
            }
        }
        if (flag && bStack.empty()) {
            System.out.println(" Well ");
        } else {
            System.out.println(" No Well ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter char :");
        String char1 = scanner.nextLine();
        Bracket(char1);
    }
}
