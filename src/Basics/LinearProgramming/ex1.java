package Basics.LinearProgramming;

import java.util.Scanner;

public class ex1 {
    public static void count(int a, int b,int c) {
        int z = (( a - 3 ) * b/2 ) + c;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        int a = in.nextInt();

        System.out.print("b: ");
        int b = in.nextInt();

        System.out.print("c: ");
        int c = in.nextInt();

        count(a,b,c);
    }
}
