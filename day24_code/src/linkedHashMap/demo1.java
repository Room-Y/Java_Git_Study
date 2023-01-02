package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 17:12
 */
public class demo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("a", 123);
        lhm.put("a", 111);
        lhm.put("c", 456);
        lhm.put("b", 789);
        System.out.println(lhm);
    }
}
