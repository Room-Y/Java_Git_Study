package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 23:50
 */
public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(1, "qqq");
        System.out.println(list);

        System.out.println(list.remove("a"));
        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.remove(1);
        System.out.println(list1);
        Integer i = Integer.valueOf(1);
        list1.remove(i);

        System.out.println(list1);

    }
}
