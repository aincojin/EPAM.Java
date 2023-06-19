package Algorithmisation.ArrayOfArrays;


import java.util.Scanner;

public class ex16 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество строк(нечет): ");
            int n = in.nextInt();

            int[][] magicSquare = new int[n][n];

            int row = n - 1;
            int col = n / 2;
            magicSquare[row][col] = 1;

            for (int i = 2; i <= n * n; i++) {
                if (magicSquare[(row + 1) % n][(col + 1) % n] == 0) {
                    row = (row + 1) % n;
                    col = (col + 1) % n;
                } else {
                    row = (row - 1 + n) % n;
                }
                magicSquare[row][col] = i;
            }

            // Вывод магического квадрата
            System.out.println("Магический квадрат размером " + n + "x" + n + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(magicSquare[i][j] + "\t");
                }
                System.out.println();
            }
        }


    /*public static void main(String[] args) {

        Random rnd = new Random();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        int [][] array = new int[n][n];

        System.out.println("Исходный массив: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                array[i][j] = rnd.nextInt(n*n)+1;
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }*/
}
