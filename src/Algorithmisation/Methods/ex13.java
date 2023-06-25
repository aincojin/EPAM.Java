//вывести все пары чисел, отличающихся на 2, из массива n...2n (n > 2)

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число больше 2: ");
        int n = in.nextInt();
        while(n <= 2){
            System.out.println("Число должно быть больше 2: ");
            n = in.nextInt();
        }
        int[] arr = arrayMaker(n);
        System.out.println("Пары числов-близнецов на отрезке от " + n + " до " + 2*n + ": ");
        twins(arr);
    }
    public static int[] arrayMaker(int n){
        int[] array = new int[2*n - n + 1];

        for(int i = 0; i < array.length; i++){
            array[i] = n;
            n++;
        }
        return array;
    }
    public static void twins(int[] array){

        int j = 2;
        for(int i = 0; i < array.length - 2; i++){
            System.out.println(array[i] + " и " + array[j]);
            j ++;
        }
    }
}
