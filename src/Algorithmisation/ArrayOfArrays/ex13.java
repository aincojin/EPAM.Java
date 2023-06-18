package Algorithmisation.ArrayOfArrays;

import java.util.Random;
import java.util.Scanner;

public class ex13 {
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

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i + 1; k < m; k++) {
                    if (array[i][j] > array[k][j]) {
                        int temp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
        }

        System.out.println("Столбцы отсортированы по возрастанию : ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i + 1; k < m; k++) {
                    if (array[i][j] < array[k][j]) {
                        int temp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
        }

        System.out.println("Столбцы отсортированы по убыванию : ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
