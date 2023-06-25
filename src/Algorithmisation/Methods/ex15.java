//вывести все n-значные числа, цифры в которых идут по возрастанию

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, сколько цифр должно быть у чисел: ");
        int n = in.nextInt();
        n -= 1;
        arrayMaker(n);
    }
    public static boolean ascendingNum(int elem){
        int value = Integer.MAX_VALUE;

        while (elem != 0){
            if(elem % 10 < value){
                value = elem % 10;
            }else {
                return false;
            }
            elem /= 10;
        }
        return true;
    }
    public static void arrayMaker(int n){ // создаем массив
        int[] array = new int[(int) (9 * Math.pow(10, n))];

        int val = (int) Math.pow(10,n);
        for (int i = 0; i < array.length; i++) {
            array[i] = val;
            val++;
            if(ascendingNum(array[i])){
                System.out.print(array[i] + " ");
            }
        }
    }

}
