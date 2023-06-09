package Basics.Branching;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();
        System.out.print("d: ");
        double d = in.nextDouble();

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
