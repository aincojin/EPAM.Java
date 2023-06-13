package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int N = in.nextInt();

        double[] array = new double[N];

        int count_negative = 0;
        int count_positive = 0;
        int count_null = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = (Math.random() * 21)-10;
            System.out.print(array[i] + "  ");
            if(array[i]<0)
                count_negative++;
            else if(array[i] == 0)
                count_null ++;
            else
                count_positive++;
        }
        System.out.println();
        System.out.println("Количество положительных элементов массива: " + count_positive);
        System.out.println("Количество отрицательных элементов массива: " + count_negative);
        System.out.println("Количество нулевых элементов массива: " + count_null);

    }
}
