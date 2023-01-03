package stream1;

import javax.lang.model.element.Name;
import java.util.ArrayList;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 18:57
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张强");

        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));

    }
}
