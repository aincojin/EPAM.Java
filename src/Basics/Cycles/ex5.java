package Basics.Cycles;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите e:");
        double e = in.nextDouble();

        double sum = 0;

        double a;

        for(int i = 1; i <= 20; i ++){
            a = ((double) 1 / Math.pow(2, i)) + ((double) 1 / Math.pow(3, i));
            if(Math.abs(a) >= e){
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
