package ss_13_timkiem;

import java.util.LinkedList;
import java.util.Scanner;

public class FindTheStringWithTheGreatestLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> maxList = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("nhap chuoi : ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
        }
        for (Character ch : maxList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
