package Algorithmisation.Sorting;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Random rnd = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("Размерность первого массива: ");
        int N = in.nextInt();
        System.out.print("Размерность второго массива: ");
        int M = in.nextInt();
        int[] array1 = new int[N+M];
        int[] array2 = new int[M];

        System.out.print("Введите число k: ");
        int k = in.nextInt();
        while (k >= N) {
            System.out.println("Введите число меньше размерности перого массива :");
            k = in.nextInt();
        }
        System.out.println("Первый массив: ");
        for(int i = 0; i < N; i++){
                array1[i] = rnd.nextInt(30)+1;
                System.out.printf("%3d ", array1[i]);
        }
        System.out.println("Второй массив: ");
        for(int i = 0; i < M; i++){
            array2[i] = rnd.nextInt(30)+1;
            System.out.printf("%3d ", array2[i]);
        }


        // Перенос чисел после позиции k в конец массива
        int j = N + M - 1;
        for (int i = N - 1; i > k; i--) {
            array1[j] = array1[i];
            array1[i] = 0;
            j--;
        }

        j = k + 1;
        for (int i = 0; i < M; i++) {
            array1[j] = array2[i];
            j++;
        }
        System.out.println("Результат: ");
        for(int i = 0; i < array1.length; i++){
            System.out.printf("%3d ", array1[i]);
        }
    }
}






