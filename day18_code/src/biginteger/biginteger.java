package biginteger;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author: Java_cmr
 * @Date: 2022/12/27 - 0:09
 */
public class biginteger {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            BigInteger bd1 = new BigInteger(4, r);
            System.out.println(bd1);
        }

        BigInteger bd2 = new BigInteger("10000000000");
        System.out.println(bd2);
        BigInteger bd3 =  BigInteger.valueOf(100);
        System.out.println(bd3);

        BigInteger bd4 = BigInteger.valueOf(16);
        BigInteger bd5 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd4);

        BigInteger bd6 = BigInteger.valueOf(17);
        BigInteger bd7 = BigInteger.valueOf(17);
        System.out.println(bd6 == bd7);

        BigInteger result = bd6.add(bd7);
        System.out.println(result);
    }
}
