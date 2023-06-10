package Basics.Branching;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Длина и ширина отверстия(ввод через Enter): ");
        double A = in.nextDouble();
        double B = in.nextDouble();
        System.out.print("Длина, ширина и высота кирпича: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        if((x<=A && y<=B) || (y<=A && x<=B)) {
            System.out.println("Пройдет.");
        }else if((x<=A && z<=B) || (z<=A && x<=B)){
            System.out.println("Пройдет.");
        }else if((z<=A && y<=B) || (y<=A && z<=B)){
            System.out.println("Пройдет.");
        }else{
            System.out.println("Не пройдет.");
        }
    }
}
