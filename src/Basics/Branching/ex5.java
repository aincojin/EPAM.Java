package Basics.Branching;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите х: ");
        double x = in.nextDouble();

        double z;

        if (x>3){
            z = 1 / (Math.pow( x, 3 ) + 6);
            System.out.println(z);
        }else{
            z = Math.pow( x, 2 ) - 3*x + 9;
            System.out.println(z);
        }
    }
}
