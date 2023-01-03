package immutate;

import java.util.List;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 18:35
 */
public class demo1 {
    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五");

        list.add(1, "a");
        System.out.println(list);
    }
}
