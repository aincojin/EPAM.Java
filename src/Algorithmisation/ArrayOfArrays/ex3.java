package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int m = in.nextInt();
        System.out.print("Ввдите количество стлолбцов: ");
        int n = in.nextInt();
        double [][] array = new double[m][n];
        System.out.println("Ввод массива: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = in.nextDouble();
            }
        }
        System.out.println("Исходный массив: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                System.out.print("  " + array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Введите номер строки: ");
        int k = in.nextInt();
        System.out.print("Введите номер столбца: ");
        int p = in.nextInt();


        System.out.print("Необходимая строка: ");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == k){
                    System.out.print(array[i-1][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Необходимый столбец: ");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(j == p){
                    System.out.println(array[i][j-1]);
                }
            }
        }
    }

}
