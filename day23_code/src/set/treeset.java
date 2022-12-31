package set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 18:00
 */
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(6);
        ts.add(2);
        ts.add(1);
        System.out.println(ts);

        for(Integer i : ts)
            System.out.println(i);

        System.out.println();

        ts.forEach(i -> System.out.println(i));

        System.out.println();

        Iterator<Integer> it = ts.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
