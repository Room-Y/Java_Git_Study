package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 17:56
 */
public class linkedHashset {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);

        LinkedHashSet<Student> hs = new LinkedHashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
