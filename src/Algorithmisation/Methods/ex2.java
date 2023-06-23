//метод для нахождения НОД четырех натуральнх чисел

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println(NOD(NOD(a,b), NOD(c,d)));
    }
    public static int NOD(int a,int b ){
        if (b == 0) {
            return a;
        }
        return NOD(b, a % b);

    }
}
