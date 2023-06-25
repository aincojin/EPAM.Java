//даны натур. числа К и N. написать метод формирования массива,состоящего из чисел,
// сумма цифр которых равна К и которые не больше N

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int k = in.nextInt();
        int n = in.nextInt();

        int []A = arr(k, n);

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

    }

    public static int[] arr(int k, int n){

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            do{
                array[i] = (int) (Math.random() * (n)) + 1;
            } while(!kCheck(k, array[i]));
        }
        return array;
    }

    public static boolean kCheck(int k, int elem){
        int sum = 0;

        while (elem != 0) {
            sum += elem % 10;
            elem /= 10;
        }
        return sum == k;
    }

}
