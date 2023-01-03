package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 23:03
 */
public class test3 {
    public static void main(String[] args) {
        ArrayList<String> manList =new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();

        Collections.addAll(manList, "蔡徐坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womanList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).forEach(s -> System.out.println(s));

        System.out.println();

        womanList.stream().filter(s -> s.startsWith("杨")).skip(1).forEach(s -> System.out.println(s));

        Stream<String> man = manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> woman = womanList.stream().filter(s -> s.startsWith("杨")).skip(1);

        List<Actor> collect = Stream.concat(man, woman).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        System.out.println(collect);

    }
}

