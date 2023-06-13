package Algorithmisation.One_DimArrays;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int Z = in.nextInt();

        double[] array = {2, -0.5, 3, 2.98, 60, -4.647, 10};

        int count = 0;

        System.out.println("Изначальный массив : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
            if(array[i] > Z){
                array[i] = Z;
                count ++;
            }
        }
        System.out.println();
        System.out.println("Измененный массив : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Количество замен: " + count);
    }
}
