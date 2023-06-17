package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        int [][] array = new int[n][n];

        int num = 1;
        int zeros = n;


        for(int i = 0; i < n; i++){
            for (int j = 0; j < zeros; j++){
                array[i][j] = num;
                System.out.print(" " + array[i][j] + " ");
            }
            num++;
            zeros--;
            System.out.println();
        }
    }
}
