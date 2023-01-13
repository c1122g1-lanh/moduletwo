package ss_11_stackvsqueue.bai_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void Palindrome(String[] newStr) {
        Stack<String> stackStr = new Stack<>();
        for (int i = 0; i < newStr.length; i++) {
            stackStr.push(newStr[i]);
        }
        System.out.println("stackStr :" + stackStr);
        Queue<String> queueStr = new LinkedList<>();
        for (int i = 0; i < newStr.length; i++) {
            queueStr.offer(newStr[i]);
        }
        System.out.println("queueStr :" + queueStr);
        boolean flag = true;
        while (!stackStr.empty()) {
            if (!stackStr.pop().equals(queueStr.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("yes");
        } else System.out.println("no");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = scanner.nextLine();
        String[] newStr = str.split("");
        Palindrome(newStr);

    }
}
