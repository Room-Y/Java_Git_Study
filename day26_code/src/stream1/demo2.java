package stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 21:21
 */
public class demo2 {
    public static void main(String[] args) {
        //单列集合，双列集合，数组，零散数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        Stream<String> stream1 = list.stream();
        stream1.forEach(s -> System.out.print(s + " "));

        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.keySet().stream().forEach(s -> System.out.println(s + ": " + hm.get(s)));
        System.out.println();

        int[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream.of(1,2,3,4,5).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
