package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int m = in.nextInt();
        System.out.print("Ввдите количество стлолбцов: ");
        int n = in.nextInt();
        int [][] array = new int[m][n];
        System.out.println("Ввод массива: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = in.nextInt();
            }
        }

        System.out.println("Исходный массив: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }

        double[]sumarr = new double[n];
        for (int j = 0; j<n; j++){
            int sum = 0;
            for(int i = 0; i < m; i++){
                sum += array[i][j];
            }
            sumarr[j] = sum;
        }
        double max_sum = Double.MIN_VALUE;
        int column = 0;
        for(int k = 0; k < n; k++){
            if(sumarr[k] > max_sum) {
                max_sum = sumarr[k];
                column = k+1;
            }
        }
        System.out.println("Столбец, сумма элементов которого наибольшая: " + column);

    }
}
