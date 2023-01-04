
package ss_2;

public class ShowOfPrime {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        System.out.println("cac snt nho hon 100 : ");
        while (number < 100) {
            if (number == 2 || number == 3) {
                System.out.println(number);
                number++;
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number);
            }
            count = 0;
            number++;
        }
    }
}

