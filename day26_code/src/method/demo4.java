package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 4:04
 */
public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5);
        Integer[] integers = list1.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }
}
