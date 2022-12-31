package set;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 18:19
 */
public class treesetCompartor {
    public static void main(String[] args) {
//        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length() == 0 ? o1.compareTo(o2) : o1.length() - o2.length();
//            }
//        });

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            return o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length();
        });

        System.out.println(ts.add("c"));
        System.out.println(ts.add("ab"));
        System.out.println(ts.add("df"));
        System.out.println(ts.add("qwer"));

        System.out.println(ts);
    }
}
