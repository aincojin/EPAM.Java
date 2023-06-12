package Basics.Cycles;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите m:");
        int m = in.nextInt();

        System.out.print("Введите n:");
        int n = in.nextInt();

        for ( int i = m; i<= n; i++ ){
            System.out.print("Делители числа " + i +" :");
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.print(j + "   ");
                }
           }
            System.out.println();
        }

    }
}
