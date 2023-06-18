package Algorithmisation.ArrayOfArrays;


import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int m = in.nextInt();
        System.out.print("Ввдите количество стлолбцов: ");
        int n = in.nextInt();

        int [][] array = new int[m][n];
        int max = Integer.MIN_VALUE;
        System.out.println("Исходный массив: ");
        for(int i = 0; i < m; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = (int)(Math.random() * 20 - 10);
                System.out.printf("%3d ", array[i][j]);
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Меняем отрицательные элементы на максимальный: ");
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if( array[i][j] < 0) array[i][j] = max;
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
