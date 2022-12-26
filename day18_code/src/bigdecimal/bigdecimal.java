package bigdecimal;

import java.math.BigDecimal;

/**
 * @author: Java_cmr
 * @Date: 2022/12/27 - 0:39
 */
public class bigdecimal {
    public static void main(String[] args) {
        System.out.println(0.09 + 0.01);
        System.out.println(0.216 - 0.1);
        System.out.println(0.226 * 0.01);
        System.out.println(0.09 / 0.1);

        System.out.println("---------------------------------");

        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);

    }
}
