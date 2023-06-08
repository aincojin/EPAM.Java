package by.epam.learn.main;

import java.util.Scanner;

public class ex2 {
    public static void count(double a, double b, double c) {
        double d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) )/ (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        double a = in.nextDouble();

        System.out.print("b: ");
        double b = in.nextDouble();

        System.out.print("c: ");
        double c = in.nextDouble();

        count(a, b, c);

    }
}
