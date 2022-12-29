package JDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 19:37
 */
public class instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println("------------------------");

        Instant ins1 = Instant.ofEpochMilli(10000L);
        System.out.println(ins1);
        Instant ins2 = Instant.ofEpochSecond(1L);
        System.out.println(ins2);
        Instant ins3 = Instant.ofEpochSecond(1L, 1000000000);
        System.out.println(ins3);

        System.out.println("------------------------");

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
    }
}
