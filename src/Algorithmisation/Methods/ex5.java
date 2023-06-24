//найти второе по величине число массива

package Algorithmisation.Methods;

import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(30) + 1;
            System.out.print(arr[i] + " ");
        }

        SecondToMax(arr);
    }

    public static void SecondToMax(int[] arr){

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != max){
                    if(arr[i] > max2){
                        max2 = arr[i];
                    }
            }
        }

        System.out.println("\nВторое по величине число массива: " + max2);



    }
}
