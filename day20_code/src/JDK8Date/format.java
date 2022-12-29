package JDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 20:12
 */
public class format {
    public static void main(String[] args) {
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time));
    }
}
