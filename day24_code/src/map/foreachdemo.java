package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 15:56
 */
public class foreachdemo {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("尹志平", "小龙女");

        Set<String> keys = m.keySet();
        keys.forEach(s -> System.out.println(m.get(s)));

        System.out.println("--------------------------------");

        Set<Map.Entry<String, String>> kvs = m.entrySet();
        kvs.forEach(s -> {
            System.out.println(s.getKey() + " " + s.getValue());
        });

        System.out.println("--------------------------------");

        m.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
