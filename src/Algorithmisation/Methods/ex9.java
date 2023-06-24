//даны длины сторон четырехугольника. найти его площадь, если угол между X and Y прямой

package Algorithmisation.Methods;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стороны четырехугольника: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int t = in.nextInt();

        System.out.print("\nПлощадь четырехугольника: ");

        System.out.println(square(x, y, z, t));
        square(x,y,z,t);
    }
    private static double square(double x, double y, double z, double t) {
        double diag = Math.sqrt(x * x + y * y);
        double sq1 = (x * y) / 2;
        double halfP = (diag + z + t) / 2;
        double sq2 = Math.sqrt(halfP * (halfP - diag) * (halfP - z) * (halfP - t));
        double sq = sq1 + sq2;
        return sq;
    }
}
