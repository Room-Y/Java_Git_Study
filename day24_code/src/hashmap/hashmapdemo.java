package hashmap;

import java.util.HashMap;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 16:48
 */
public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<Students, String> hm = new HashMap<>();

        Students s1 = new Students("张三", 23);
        Students s2 = new Students("李四", 24);
        Students s3 = new Students("王五", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");

        hm.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
