package immutate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 18:45
 */
public class demo2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        Map map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
    }
}
