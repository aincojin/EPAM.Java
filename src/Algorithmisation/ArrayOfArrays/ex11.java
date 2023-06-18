package Algorithmisation.ArrayOfArrays;

import java.util.Random;

public class ex11 {
    public static void main(String[] args) {
        int[][]array = new int[10][20];
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                array[i][j] = rnd.nextInt(15)+1;
                System.out.printf("%3d ", array[i][j]);
            }

            System.out.println();
        }
        System.out.print("Номера строк,где 5 встречается три или более раза: ");
        for (int i = 0; i < 10; i++) {
            int counter = 0; //сколько раз встречается 5 в строке
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 5) counter++;
            }
            if(counter >= 3) System.out.print(" " + i + " ");
        }
    }
}
