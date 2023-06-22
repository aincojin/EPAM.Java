package Algorithmisation.Sorting;


import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность первого массива: ");
        int N = in.nextInt();
        System.out.print("Размерность второго массива: ");
        int M = in.nextInt();
        int[] arr1 = new int[N+M];
        int[] arr2 = new int[M];

        System.out.println("Первый массив: ");
        for(int i = 0; i < N; i++){
            arr1[i] = rnd.nextInt(30)+1;

        }

        for( int i = 0; i < N-1; i++){
            for(int j = i + 1; j < N; j++){
                if(arr1[i] > arr1[j]){
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int i = 0; i < M; i++) {
            System.out.printf("%3d ", arr1[i]);
        }

        System.out.println();
        System.out.println("Второй массив: ");
        for(int i = 0; i < M; i++){
            arr2[i] = rnd.nextInt(30)+1;
        }
        for( int i = 0; i < arr2.length - 1; i++){
            for(int j = i + 1; j < arr2.length; j++){
                if(arr2[i] > arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for(int i = 0; i < M; i++) {
            System.out.printf("%3d ", arr2[i]);
        }

        // Перенос чисел после позиции k в конец массива
        int j = N + M - 1;
        for (int i = N - 1; i >= 0; i--) {
            arr1[j] = arr1[i];
            arr1[i] = 0;
            j--;
        }

        j = 0;
        for (int i = 0; i < M; i++) {
            arr1[j] = arr2[i];
            j++;
        }

        for(int i = 0; i < arr1.length-1; i++) {
            for (int k = i+1; k < arr1.length; k++){
                if(arr1[i] > arr1[k]){
                    int temp = arr1[k];
                    arr1[k] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        System.out.println();

        for(int i = 0; i < arr1.length; i++) {
            boolean alreadyFeat = false;
            for(int k = 0; k < arr2.length; k++){
                if(arr1[i] == arr2[k] && !alreadyFeat) {
                    System.out.println("Элемент " + arr2[k] + " должен находиться на позиции " + i);
                    alreadyFeat = true;
                }
            }

        }
        System.out.println("Результат: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.printf("%3d ", arr1[i]);
        }
    }
}
