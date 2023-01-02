package treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 17:46
 */
public class demo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm.put(1, "a");
        tm.put(2, "b");
        tm.put(3, "c");
        tm.put(7, "d");
        tm.put(5, "e");
        System.out.println(tm);

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        TreeMap<Student, String> tms = new TreeMap<>();
        tms.put(s1, "江苏");
        tms.put(s2, "北京");
        tms.put(s3, "天津");

        System.out.println(tms);


    }
}
