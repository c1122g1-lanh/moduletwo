package ss_4_oop.quadratic_equation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b :");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c :");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("QuadraticEquation is no roots .");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("QuadraticEquation have to 1 roots : root1 = root2 =  " + quadraticEquation.getRoot1());
        } else {
            System.out.println("QuadraticEquation have to 2 roots : ");
            System.out.println(" root1 = " + quadraticEquation.getRoot1());
            System.out.println(" root2 = " + quadraticEquation.getRoot2());
        }

    }
}
