package Basics.Branching;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Первый угол: ");
        double a = in.nextDouble();
        System.out.print("Второй угол: ");
        double b = in.nextDouble();

        boolean flag = false;
        double sum = a + b;

        if ( sum == 90 ){
            flag = true;
            System.out.println(flag);
        } else{
            System.out.println(flag);
        }
    }


}
