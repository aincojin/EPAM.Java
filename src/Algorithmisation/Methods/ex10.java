//метод, создающий массив, состоящий из цифр заданного числа

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int N = in.nextInt();
        numArray(N);
    }
    public static void numArray(int n){

        int[] arr = new int[countNum(n)];
        int i = 1;

            for(int j = 0; j < arr.length; j++) {
                int a;
                a = (n / i) % 10;
                arr[j] = a;
                System.out.print(arr[j] + " ");
                if((n / i) % 10 == n/i){
                    break;
                }
                if(i == 1) i+=9;
                else i*=10;

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
