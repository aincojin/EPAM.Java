package Basics.Branching;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("A(x1, y1): ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("B(x2, y2): ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.print("C(x3, y3): ");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        if((x3-x1) / (x2 - x1) - (y3-y1) / (y2-y1) == 0) {
            System.out.println("Эти точки принадлежат одной прямой");
        }else {
            System.out.println("Эти точки не принадлежат одной прямой");
        }

    }
}
