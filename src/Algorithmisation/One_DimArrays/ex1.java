package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int N = in.nextInt();

        System.out.print("Введите K: ");
        int K = in.nextInt();

        int sum = 0;

        int[] array = new int[N];

        for(int i = 0; i<N; i ++){
            array[i] = i+1;
            if(array[i] % K == 0){
                sum += array[i];
            }
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.print("Сумма чисел, кратных " + K + " равна: " + sum);

    }
}
