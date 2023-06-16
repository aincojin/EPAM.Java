package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
