//определить суммы для каждой тройки элементов с к-го до м-го

package Algorithmisation.Methods;

public class ex8 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 0;
        int m = 6;

        tripleSum(arr, k, m);
    }
    public static void tripleSum(int[] array, int k, int m){

        for(int i = k; i < array.length; i++){
            int sum = 0;
           if(i + 2 <= m){
                sum = array[i] + array[i + 1] + array[i + 2];
                System.out.println("Сумма элементов " + i + ", " + (i + 1) + " и " + (i + 2)+ " равна: " + sum);
            }
        }

    }
}
