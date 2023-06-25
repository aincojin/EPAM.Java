//в каком из данных двух чисел больше цифр

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if( countNum(a) > countNum(b)){
            System.out.print("\nВ первом числе больше цифр");
        } else if (countNum(a) ==  countNum(b)) {
            System.out.print("\nВ обоих чисел одинаковое количество цифр");
        }else {
            System.out.print("\nВо втором числе больше цифр");
        }
    }

    public static int countNum(int n){

        int count = 0;

        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
