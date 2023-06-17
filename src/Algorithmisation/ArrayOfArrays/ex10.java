package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        double [][] array = new double[n][n];

        System.out.println("Ввод массива: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = in.nextDouble();
            }
        }
        System.out.println("Исходный массив: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("  " + array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("Положительные элементы главной диагонали: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == j && array[i][j] > 0){
                    System.out.print(" " + array[i][j] + " ");
                }
            }
        }
        
        
  
    }
}
