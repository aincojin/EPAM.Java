//найти пару точек, между которыми наибольшее расстояние

package Algorithmisation.Methods;
import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество точек: ");
        int n = in.nextInt();

        int[][] arr1 = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = rnd.nextInt(10) + 1;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        dist(arr1);
    }

    public static void dist(int[][] arr1) {
        double distance;
        double max_dist = Double.MIN_VALUE;
        int max_x1 = 0;
        int max_x2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                distance = Math.sqrt(Math.pow(arr1[i][0] - arr1[j][0], 2) +
                        Math.pow(arr1[i][1] - arr1[j][1], 2));
                System.out.println("Расстояние между точкой " + i + " и точкой " + j + ": " + distance);
                if(distance > max_dist) {
                    max_dist = distance;
                    max_x1 = i;
                    max_x2 = j;
                }
            }
        }
        System.out.println("Наибольшее расстояние - между точками " + max_x1 + " и " + max_x2 + ": "  + max_dist);
    }

}
