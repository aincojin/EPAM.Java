package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int i, j, commonNumber, howManyTimes, counter;
        commonNumber = 0;
        howManyTimes = 1;
        counter = 0;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if(array[i] == commonNumber) break;
                if (array[i] == array[j])
                    counter++;

            }
            if (((howManyTimes == counter) && (commonNumber > array[i])) || (howManyTimes < counter)) {  /*выбираем меньшее из "одинаковых*/
                commonNumber = array[i];
                howManyTimes = counter;
            }
            counter = 0;

        }
        System.out.print("\n Наименьшее из наиболее часто встречающихся чисел = " + commonNumber +
                " встречается " + howManyTimes + " раз.");
    }
}
