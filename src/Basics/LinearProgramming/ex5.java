package Basics.LinearProgramming;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("T: ");

        int T = in.nextInt();

        int H = T / 3600;
        int M = (T - H * 3600) / 60;
        int S = T - H * 3600 - M * 60;

        System.out.println("Время: " + H + "ч " + M + "мин " + S + "с");
    }

}
