package ss_2;

public class Show20FirstOfPrime {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        int countOfPrime = 0;
        System.out.println("20 snt dau la : ");
        while (countOfPrime < 20) {
            if (number == 2 || number == 3) {
                System.out.println(number);
                countOfPrime++;
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
                countOfPrime++;
                System.out.println(number);
            }
            count = 0;
            number++;
        }
    }
}
