package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: Java_cmr
 * @Date: 2022/12/27 - 1:09
 */
public class bigdecimalFunc {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal(3.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, 10, RoundingMode.UP));
    }
}
