package JDK8Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 20:24
 */
public class Gap {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1998, 5, 18);
        System.out.println(birthday);

        Period period = Period.between(today, birthday);
        System.out.println(period);

        System.out.println(ChronoUnit.DAYS.between(today, birthday));
    }
}
