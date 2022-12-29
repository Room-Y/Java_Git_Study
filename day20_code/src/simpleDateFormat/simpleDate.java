package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 2:26
 */
public class simpleDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy--MM--dd  |  HH--mm--ss  EE");

        Date d = new Date(0L);
        System.out.println(sdf.format(d));
        System.out.println(sdf1.format(d));

        String s = "2023--12--29  |  00--00--00  周四";
        Date d1 = sdf1.parse(s);
        System.out.println(d1);
    }
}
