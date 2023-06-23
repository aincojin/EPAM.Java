//вычислить площадь правильного шестиугольника со стороной а
package Algorithmisation.Methods;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону правильного шестиугольника: ");
        int a = in.nextInt();
        square(a);
    }
    public static void square(int a){
        double tr_sq = (Math.pow(a, 2) * Math.sqrt(3) / 4);
        System.out.println("Площадь правильного шестиугольника с данной стороной: " + tr_sq * 6);
    }
}
