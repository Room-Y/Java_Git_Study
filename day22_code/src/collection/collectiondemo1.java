package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 16:42
 */
public class collectiondemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        System.out.println(coll.add("adad"));
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);

        coll.add("a");
        coll.add("a");
        coll.add("d");
        System.out.println(coll);
        System.out.println(coll.remove("a"));
        System.out.println(coll.remove("b"));
        System.out.println(coll);

        System.out.println(coll.contains("a"));
        System.out.println(coll.contains("b"));


        System.out.println(coll.size());
        System.out.println(coll.isEmpty());
    }
}
