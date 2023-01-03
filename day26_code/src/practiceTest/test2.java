package practiceTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 4:18
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        String[] aa = list.stream().map(Student::getName).toArray(String[]::new);

        list.stream().map(s-> s.getName()).forEach(s -> System.out.println(s));

        System.out.println(Arrays.toString(aa));
    }
}
