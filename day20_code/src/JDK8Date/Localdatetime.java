package JDK8Date;

import java.time.LocalDate;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 20:19
 */
public class Localdatetime {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        LocalDate ldDate = LocalDate.of(2023, 1, 6);
        System.out.println(ldDate);

        System.out.println(ldDate.withMonth(2));
        System.out.println(ldDate);

        System.out.println(ldDate.isAfter(ldDate.plusDays(1)));


    }
}
