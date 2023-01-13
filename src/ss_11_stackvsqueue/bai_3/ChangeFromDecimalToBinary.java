package ss_11_stackvsqueue.bai_3;

import java.util.Scanner;
import java.util.Stack;

public class ChangeFromDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        System.out.println(stack);
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
