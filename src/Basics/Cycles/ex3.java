package Basics.Cycles;

public class ex3 {
    public static void main(String[] args) {

        int x = 0;

        int sum = 0;

        while ( x <= 100 ){
            sum += Math.pow(x, 2);
            x ++;
        }

        System.out.println(sum);
    }
}
