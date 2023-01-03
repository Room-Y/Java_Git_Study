package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 22:54
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan, 23", "lisi, 24", "wangwu, 25");

        Map<String, Integer> collect = list.stream().filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24).collect(Collectors.toMap(s -> s.split(", ")[0], s -> Integer.parseInt(s.split(", ")[1])));
        System.out.println(collect);
    }
}
