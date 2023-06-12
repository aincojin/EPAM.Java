package Basics.Cycles;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("x:");
        int x = in.nextInt();

        int i = 1;

        int sum = 0;

        while (i <= x){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
