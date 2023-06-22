package Algorithmisation.Sorting;

import java.util.Random;
import java.util.Scanner;


public class ex8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество дробей: ");
        int n = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = rnd.nextInt(30) + 1;
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = rnd.nextInt(30) + 1;
        }

        System.out.println("Даны дроби:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "/" + arr2[i] + "  ");
        }
        System.out.println();

        int[] newNumerators = new int[n];
        int[] newDenominators = new int[n];

        int commonDenominator = findLeastCommonMultiple(arr2);

        for (int i = 0; i < n; i++) {
            newNumerators[i] = arr1[i] * (commonDenominator / arr2[i]);
            newDenominators[i] = commonDenominator;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (newNumerators[j] > newNumerators[j + 1]) {
                    // Обмен числителей
                    int tempNum = newNumerators[j];
                    newNumerators[j] = newNumerators[j + 1];
                    newNumerators[j + 1] = tempNum;

                    // Обмен знаменателей
                    int tempDenom = newDenominators[j];
                    newDenominators[j] = newDenominators[j + 1];
                    newDenominators[j + 1] = tempDenom;
                }
            }
        }

        System.out.println("Приведенные дроби по возрастанию:");
        for (int i = 0; i < n; i++) {
            System.out.print(newNumerators[i] + "/" + newDenominators[i] + "  ");
        }
    }

    private static int findLeastCommonMultiple(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}


