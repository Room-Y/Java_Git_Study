package Date;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 2:13
 */
public class date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Date d1 = new Date(0L);
        System.out.println(d1);

        d.setTime(1000L);
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
