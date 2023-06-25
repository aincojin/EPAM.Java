//найти все числа армстронга на отрезке от 1 до заданного числа

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число больше единицы: ");
        int k = in.nextInt();
        int[] arr = arrayMaker(k);

        System.out.print("Числа Армстронга на отрезке от 1 до " + k + ": ");
        for (int j : arr) {
            if (armstrongNum(j)) {
                System.out.print(j + " ");
            }
        }
    }
    public static boolean armstrongNum(int elem){
        int sum = 0;

        int count = countNum(elem);//считаем количество цифр

        int temp = elem;
        while(temp != 0){
            sum += Math.pow(temp % 10, count);
            temp /= 10;
        }
        return sum == elem;
    }
    public static int countNum(int num){
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int[] arrayMaker(int k){
        int[] array = new int[k];
        int n = 1;
            for (int i = 0; i < array.length; i++) {
                if(n <= k) {
                    array[i] = n;
                    n++;
                }
            }

        return array;
    }
}
