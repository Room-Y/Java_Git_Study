package stream1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 22:03
 */
public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        System.out.println();

        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.println(list.stream().count());
        System.out.println();

        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));

        list.stream().filter(s -> "男".equals(s.split("-")[1])).forEach(s->System.out.print(s + " "));
        System.out.println();

        List<String> newList = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newList);

        Set<String> newSet = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newSet);
        System.out.println();

        Map<String, Integer> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(collect);

        Map<String, Integer> collect1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(collect1);
    }
}
