package Basics.Cycles;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int m = in.nextInt();

        System.out.print("Введите второе число:");
        int n = in.nextInt();

        int[] arr = new int[10];
        while(m != 0){
            arr[m % 10]=1;
            m /=10;
        }
        while(n != 0){
            if(arr[n % 10] != 0) {
                System.out.println(n % 10);
                arr[n % 10] = 0;
            }
            n /=10;
        }

    }
}
