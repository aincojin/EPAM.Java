package Basics.Cycles;

import java.math.BigInteger;

public class ex4 {
    public static void main(String[] args) {

        BigInteger res = BigInteger.ONE;

      /*  BigInteger res = new BigInteger()*/
        for( int i = 1 ; i <= 200; i ++) {
            res = res.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(res);
    }

}

