//среди n-значных чисел найти те,что состоят только из неч. цифр, найти их сумму и посчитать кол-во
//чет цифр в этой сумме

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, сколько цифр должно быть у чисел: ");
        int n = in.nextInt();
        n -= 1;
        int[] arr = arrayMaker(n);
        System.out.println("Количество четных цифр в полученной выше сумме: " + countSumOdd(sumOfOdd(arr)));//выводим количество четных цифр в полученной сумме
    }

    public static int[] arrayMaker(int n){ // создаем массив
        int[] array = new int[(int) (9 * Math.pow(10, n))];

        int val = (int) Math.pow(10,n);
        for (int i = 0; i < array.length; i++) {
            array[i] = val;
            val++;
        }

        return array;
    }
    public static boolean odd(int elem){//находим те числа массива,кот. сост. только из нечетю цифр
        int num;
        while(elem != 0){
            num  = elem % 10;
            if(num % 2 == 0){
                return false;
            }
            elem /= 10;
        }
        return true;
    }
    public static int sumOfOdd(int[] array){//считаем сумму чисел,сост. только из нечет. цифр
        int sum = 0;
        for (int i : array) {
            if (odd(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел, сост. только из нечёт. цифр: " + sum);
        return sum;
    }
    public static int countSumOdd(int n){ // считаем количество чет. цифр в полученной сумме
        int count = 0;
        while(n != 0){
            if(n % 2 == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }

}
