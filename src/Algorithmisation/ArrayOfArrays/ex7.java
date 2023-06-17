package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        double [][] array = new double[n][n];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                double a = Math.sin((double)(i * i - j * j)/n);
                array[i][j] = a;
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
