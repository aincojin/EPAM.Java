package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        int [][] array = new int[n][n];

        for(int i = 0; i < n; i++){
            int num_even = 1;
            int num_odd = n;
            for(int j = 0; j < n; j++){
                if(i % 2 == 0) {
                    array[i][j] = num_even;
                    num_even++;
                }else{
                    array[i][j]=num_odd;
                    num_odd--;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
