package ss_13_timkiem;

import java.util.LinkedList;
import java.util.Scanner;

public class IncrementsOfTheGreatestLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi : ");
        String string = scanner.nextLine();

        LinkedList<Character> maxList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
            list.clear();
        }
        for (Character ch : maxList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
