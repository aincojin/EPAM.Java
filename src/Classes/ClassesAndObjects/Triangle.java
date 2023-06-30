package Classes.ClassesAndObjects;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private Triangle(){
        a = 0;
        b = 0;
        c = 0;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        createTriangle(triangle);
        System.out.println("Площадь данного треугольника = " + square(triangle));
    }
    public static void createTriangle(Triangle triangle){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три стороны треугольника: ");
        triangle.a = in.nextInt();
        triangle.b = in.nextInt();
        triangle.c = in.nextInt();
        System.out.printf("Добавлен треугольник со сторонами %d, %d и %d",triangle.a,triangle.b,triangle.c);
    }
    public  static double square(Triangle tr){
        int perimeter = perimeter(tr);
        System.out.println("\nПериметр данного треугольника = " + perimeter);
        double halfP = (double) perimeter / 2;
        return Math.sqrt(halfP * (halfP - tr.a) * (halfP - tr.b) * (halfP - tr.c));
    }

    public  static int perimeter(Triangle triangle){
       return triangle.a + triangle.b + triangle.c;
    }



}
