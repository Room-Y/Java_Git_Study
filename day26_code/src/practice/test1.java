package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 22:52
 */
public class test1 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9};
//        Arrays.stream(list).filter(s -> s % 2 == 1).map(s -> Integer.valueOf(s)).collect(Collectors.toList());

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,2,3,4,5,6,7,8,9);
        List<Integer> collect = list1.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
