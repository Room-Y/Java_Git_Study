package encodeOrdecode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 3:20
 */
public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai你啊";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));


        System.out.println();

        System.out.println(new String(bytes));
        System.out.println(new String(bytes, "GBK"));
        System.out.println(new String(gbks));
        System.out.println(new String(gbks, "GBK"));
    }
}
