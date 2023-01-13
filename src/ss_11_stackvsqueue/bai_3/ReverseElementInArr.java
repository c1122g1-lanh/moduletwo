package ss_11_stackvsqueue;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseElementInArr {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (!stack.empty()) {
            System.out.print(newStack.push(stack.pop()));
        }
        System.out.println();
        System.out.println(stack);
        System.out.println(newStack);
        /**
         * reverse element in array.
         */
        Stack<String> wStack = new Stack<>();
        Stack<String> mWord = new Stack<>();
        mWord.push("l");
        mWord.push("a");
        mWord.push("n");
        mWord.push("h");
        for (int i = 0; i < mWord.size(); i++) {
            wStack.push(mWord.get(i));
        }
        System.out.println(wStack);
        while (!wStack.empty()) {
            System.out.print(mWord.push(wStack.pop()) + " ");
        }
    }
}
