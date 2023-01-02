package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 15:47
 */
public class mapdemo1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        System.out.println(m.put("郭靖", "黄蓉"));
        m.put("韦小宝", " 沐剑屏");
        m.put("尹志平", "小龙女");

        System.out.println(m.put("韦小宝", "双儿"));

        System.out.println(m);

        System.out.println(m.remove("郭靖"));
        System.out.println(m);

//        m.clear();
//        System.out.println(m);

        System.out.println(m.containsKey("韦小宝"));
        System.out.println(m.containsValue("小龙女"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
    }


}
