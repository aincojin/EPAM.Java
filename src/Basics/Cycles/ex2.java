package Basics.Cycles;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите начало отрезка:");
        double a = in.nextDouble();

        System.out.print("Введите конец отрезка:");
        double b = in.nextDouble();

        System.out.print("Введите шаг:");
        double h = in.nextDouble();

        System.out.print("Введите x:");
        double x = in.nextDouble();

        double res;

        while ( x >=a && x<=b) {
            if( x > 2 ){
                res = x;
                System.out.println(res);
                x += h;
            }else {
                res = -x;
                System.out.println(res);
                x += h;
            }
        }

    }
}
