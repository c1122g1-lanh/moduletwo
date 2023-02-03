package ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        input();

    }

    public static void input() {

        Scanner scanner = new Scanner(System.in);
        int sideA = 0;
        int sideB = 0;
        int sideC = 0;
        boolean check = true;
        do {
            try {
                System.out.println("nhap canh a :");
                sideA = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh b :");
                sideB = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap canh c :");
                sideC = Integer.parseInt(scanner.nextLine());

                if (sideA < 0 || sideB < 0 || sideC < 0) {
                    throw new NegativeMyException();
                } else if ((sideA + sideB) <= sideC || (sideC + sideB) <= sideA || (sideA + sideC) <= sideB) {
                    throw new SumOf2SidesIsNotGreaterThanTheOtherSideException();
                } else {
                    System.out.println(" 3 canh cua tam giac : " + "canh a = " + sideA + " , canh b = " + sideB + " , canh c = " + sideC);
                    check = false;
                }
            } catch (NumberFormatException e) {
                System.out.println(" khong duoc nhap chu ");
                System.out.println("moi nhap lai ");
                check = true;
            } catch (NegativeMyException e) {
                System.out.println(" khong duoc nhap so am ");
                System.out.println("moi nhap lai ");
                check = true;
            } catch (SumOf2SidesIsNotGreaterThanTheOtherSideException e) {
                System.out.println(" nhap canh khong phu hop ");
                System.out.println("moi nhap lai ");
                check = true;
            }
        } while (check);
    }
}
