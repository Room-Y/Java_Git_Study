package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 18:05
 */
public class treesetdemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("aaa", 23);

        TreeSet<Student> ts = new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));
        System.out.println(ts.add(s4));

        System.out.println(ts);
    }
}
