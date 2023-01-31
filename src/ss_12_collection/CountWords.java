package ss_12_collection;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string :");
        String strWords = scanner.nextLine();
        String[] arr = strWords.toLowerCase().split("");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
    }
}
