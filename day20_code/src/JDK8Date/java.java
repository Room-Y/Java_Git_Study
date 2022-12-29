package JDK8Date;

import java.time.ZoneId;
import java.util.Set;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 19:25
 */
public class java {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        System.out.println("--------------------------");

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        System.out.println("--------------------------");

        System.out.println(ZoneId.of("Pacific/Kwajalein"));
    }
}
