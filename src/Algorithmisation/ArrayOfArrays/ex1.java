package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int k = in.nextInt();
        System.out.print("Ввдите количество стлолбцов: ");
        int n = in.nextInt();
        double [][] array = new double[k][n];
        System.out.println("Ввод массива: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = in.nextDouble();
            }
        }
        System.out.println("Исходный массив: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<n; j++){
                System.out.print("  " + array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Полученные столбцы: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<n; j++){
                if((array[0][j] > array[k-1][j]) && j % 2 == 0){
                    System.out.print("  " + array[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
