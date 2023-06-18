package Algorithmisation.ArrayOfArrays;

import java.util.Random;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Random rnd = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int m = in.nextInt();
        System.out.print("Ввдите количество стлолбцов: ");
        int n = in.nextInt();

        int [][] array = new int[m][n];

        System.out.println("Исходный массив: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = rnd.nextInt(30)+1;
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Строки отсортированы по возрастанию : ");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++){
                    if(array[i][j] > array[i][k]){
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Строки отсортированы по возрастанию : ");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++){
                    if(array[i][j] < array[i][k]){
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    /*    System.out.println("Строки отсортированы по убыванию : ");
        for(int i = 0; i < m; i++) {
            for (int j = array.length-1; j >= 0; j--) {
                for (int k = j-1; k >= 0; k--){
                    if(array[i][j] < array[i][k]){
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }*/

    }
}
