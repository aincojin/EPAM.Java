//сколько раз вычесть из числа сумму его цифр,чтобы получился 0

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        int sumNum = sumNum(n);
        subtract(n, sumNum);

    }
    public static int sumNum(int n){
        int sum = 0;
            while( n != 0){
                sum += n % 10;
                n /= 10;
            }
        System.out.println(sum);
        return sum;
    }
    public static void subtract(int n, int sumNum){
        int countSub = 0;
        while( n != 0){
            n -= sumNum;
            countSub++;
            if(n < 0){
                System.out.println("Отнимая сумму цифр этого числа, оно не превращается в ноль," +
                        " а становится отрицательным за " + countSub + " итераций."
                );
                break;
            }else if(n == 0){
                System.out.println("Отнимая сумму цифр из числа, можно дойти до нуля за " + countSub + " итераций.");
            }
        }
    }
}
