//метод,вычисляющий сумму факториалов нечетных чисел массива от 1...9

package Algorithmisation.Methods;

public class ex7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        oddFactSum(arr);
    }
    public static void oddFactSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += factorial(arr[i]);
            }
        }
        System.out.println(sum);
    }

    public static int factorial(int n){
        if(n == 1) {
            return 1;
        }else{
            return n * factorial(n - 1);
        }

    }
}
