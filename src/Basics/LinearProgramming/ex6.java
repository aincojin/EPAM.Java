package Basics.LinearProgramming;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        double x = in.nextDouble();

        System.out.print("y = ");
        double y = in.nextDouble();

        boolean flag = true;

        if ( x==0 && y ==-1 ){
            flag = false;
            System.out.println(flag);
        }
        else if ( x<=4 && x >= -4 && y<=0 && y >= -3 ){
            System.out.println(flag);
        }
        else if ( x<=2 && x >= -2 && y<=4 && y >= 0 ){
            System.out.println(flag);
        }
        else {
            flag = false;
            System.out.println(flag);
        }
    }
}
