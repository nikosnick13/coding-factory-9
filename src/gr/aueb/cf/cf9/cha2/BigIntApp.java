package gr.aueb.cf.cf9.cha2;

import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("123456789314324324");
        BigInteger bigNum2 = new BigInteger("98765432454542543251");
        BigInteger bigResult = BigInteger.ZERO;

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("The result is: %,d%n", bigResult);

        BigInteger num3 = new BigInteger("23423423");

        bigResult = num3.add(bigNum2);

        System.out.printf("The result is: %,d%n", num3);


    }
}
