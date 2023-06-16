package Algorithmisation.One_DimArrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int n = in.nextInt();
        int[] array = new int[n];

        System.out.print("Введите " + n + " элементов массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                count = 1;
            }else if(array[i] == min){
                count++;
            }
        }

        int[] array_res = new int[array.length - count];
        System.out.println("Получившийсся массив: ");
        for (int i = 0, j=0; i < array.length; i++,j++){
            if(array[i] != min){
                array_res[j] = array[i];
            }else{
                j--;
            }
        }

        System.out.println();
        for(int i = 0; i< array_res.length; i++){
            System.out.print(array_res[i] + " ");
        }
    }
}

