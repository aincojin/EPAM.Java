package Algorithmisation.ArrayOfArrays;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        int [][] array = new int[n][n];

        int first = 0;
        int last = n-1;

        for(int i = 0; i < n; i++){
            if(first >= last || i >= (n/2)){
                first--;
                last++;
            }
            for (int j = 0; j < n; j++) {
                if(j >= first && j <= last) {
                    array[i][j] = 1;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            if((first < last) && i < (n/2)){
                first++;
                last--;
            }
            System.out.println();
        }
    }
}
