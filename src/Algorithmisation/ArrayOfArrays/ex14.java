package Algorithmisation.ArrayOfArrays;


import java.util.Random;

public class ex14 {

    public static void main(String[] args) {

            Random random = new Random();
            int m = random.nextInt(11);
            int n = random.nextInt(11);

            int[][] arr = new int[m][n];

            for (int j = 0; j < n; j++) {
                int amountOne = j + 1;
                while (amountOne > 0) {
                    int pos = random.nextInt(m);
                    if (arr[pos][j] != 1) {
                        arr[pos][j] = 1;
                        amountOne--;
                    }
                }
            }
            printArr(arr);
        }

    public static void printArr(int[][] arr) {
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



}
