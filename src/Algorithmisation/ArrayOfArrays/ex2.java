package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int k = in.nextInt();
        double [][] array = new double[k][k];
        System.out.println("Ввод массива: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<k; j++){
                array[i][j] = in.nextDouble();

            }

        }
        System.out.println("Исходный массив: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<k; j++){
                System.out.print("  " + array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Элементы, стоящие на диоганали: ");
        for(int i = 0; i < k; i++){
            for (int j = 0; j<k; j++){
                if(i == j){
                    System.out.print(" "+ array[i][j] +" ");
                }
            }
        }
    }
}
