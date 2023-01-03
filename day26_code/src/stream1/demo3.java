package stream1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 21:46
 */
public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println();

        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println();

        list.stream().skip(3).forEach(s -> System.out.println(s));

        list.add("张无忌");
        System.out.println(list);

        list.stream().distinct().forEach(s->System.out.print(s + " "));
        System.out.println();

        Stream.concat(list.stream(), list.stream().limit(3)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println();


    }
}
