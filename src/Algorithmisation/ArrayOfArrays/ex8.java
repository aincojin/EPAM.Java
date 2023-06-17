package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex8 {
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

        System.out.print("Ввдите номер первого столбца: ");
        int a = in.nextInt();
        System.out.print("Ввдите номер второго столбца: ");
        int b = in.nextInt();
        if(a > n || b > n){
            System.out.println("Такого столбца не существует.");
        }else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == a-1 && a < b) {
                        double temp = array[i][j];
                        array[i][j] = array[i][b-1];
                        array[i][b-1] = temp;
                    } else if (j == b-1 && a > b) {
                        double temp = array[i][j];
                        array[i][j] = array[i][a-1];
                        array[i][a-1] = temp;
                    }
                    System.out.print("  " + array[i][j] + "  ");
                }
                System.out.println();
            }
        }

    }
}
