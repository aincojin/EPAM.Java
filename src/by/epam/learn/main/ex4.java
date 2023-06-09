package by.epam.learn.main;

import java.util.Scanner;

public class ex4 {

    public static void count(double x) {

        double n = (int) x;
        double y = (x * 1000) % 1000 + n / 1000;
        System.out.println(y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        double x = in.nextDouble();

        count(x);

    }
}
