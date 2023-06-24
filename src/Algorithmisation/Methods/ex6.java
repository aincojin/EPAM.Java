//метод, определяющий, являются ли три числа взаимно простыми

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        prime(a,b,c);
    }

    public static void prime(int a, int b, int c){
        if(NOD(b,c) == 1 && NOD(a,c) == 1 && NOD(b,a) == 1){
            System.out.println("Это взаимно простые числа.");
        }else {
            System.out.println("Эти числа не являются взаимно простыми.");
        }
    }

    private static int NOD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return NOD(b, a % b);
    }
}
