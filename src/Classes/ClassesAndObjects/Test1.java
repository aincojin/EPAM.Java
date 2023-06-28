package Classes.ClassesAndObjects;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int x = 1;
        int y = 7;
        String xname = "x";
        String yname = "у";

        show(x, y);
        sum(x, y);
        max(x, y);
        change(x, xname);
        change(y, yname);
    }
    private static void show(int x,int y){
        System.out.println("x = " + x + ", y = " + y);
    }
    private static void change(int z, String name){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите новое значение для " + name + ": ");
        z = in.nextInt();
    }
    private static void sum(int x, int y){
        System.out.println("Сумма = " + (x + y));
    }
    private static void max(int x, int y){
        if(x > y){
            System.out.println("x > y");
        }else if(y > x){
            System.out.println("y > x");
        }else{
            System.out.println("Х и У равны!");
        }
    }
}
