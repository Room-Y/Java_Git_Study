package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 17:32
 */
public class bianli {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        System.out.println(s.add("张三"));
        System.out.println(s.add("张三"));
        System.out.println(s.add("李四"));
        System.out.println(s.add("王五"));

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        for(String str : s){
            System.out.println(str);
        }

        System.out.println();

        s.forEach(str -> System.out.println(str));

        System.out.println(s);
    }
}
