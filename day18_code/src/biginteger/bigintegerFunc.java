package biginteger;

import java.math.BigInteger;

/**
 * @author: Java_cmr
 * @Date: 2022/12/27 - 0:30
 */
public class bigintegerFunc {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);


        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0] + " " + arr[1]);

        BigInteger bd4 = BigInteger.valueOf(10);
        System.out.println(bd1.equals(bd2));
        System.out.println(bd1.equals(bd4));

        BigInteger bd5 = bd1.pow(3);
        System.out.println(bd5);

        System.out.println(bd1.max(bd2));

    }
}
