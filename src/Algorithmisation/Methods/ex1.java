//написать метод(ы) для нахождения НОК и НОД двух натуральных чисел

package Algorithmisation.Methods;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.print("\nНОК = " + NOK(a,b));
        System.out.print("\nНОД = " + NOD(a,b));

    }
    private static int NOK(int a, int b) {
        return (a * b) / NOD(a, b);
    }

    private static int NOD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return NOD(b, a % b);
    }
}
