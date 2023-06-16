package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int n = in.nextInt();
        double[] array = new double[n];

        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
            System.out.println(array[i] + " ");
        }

        double[] sum_array = new double[n - 1];
        double max_res = 0;
        for (int i = 0; i < array.length - 1; i ++) {
                double sum_of_two = array[i] + array[i + 1];
                sum_array[i] = sum_of_two;
        }

        for (int i = 0; i < sum_array.length - 1; i++) {
            max_res = Math.max(sum_array[i], sum_array[i + 1]);
        }
        System.out.println();
        System.out.println("Результат: " + max_res + ".");

    }
}
