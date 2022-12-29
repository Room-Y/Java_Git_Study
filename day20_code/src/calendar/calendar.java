package calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 2:38
 */
public class calendar {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c);

        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        System.out.println("-----------------------------");

        System.out.println(c.get(1));
        System.out.println(c.get(2));
        System.out.println(c.get(3));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        System.out.println("-----------------------------");

        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONDAY, 11);
        c.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(c.get(Calendar.WEDNESDAY));
    }
}
