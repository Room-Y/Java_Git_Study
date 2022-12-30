package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 23:25
 */
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        System.out.println(it.next());   //NoSuchElementException

        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()){
            String str = it1.next();
            if("b".equals(str))
//                list.remove("b");
                it1.remove();
        }

        System.out.println(list);
    }
}
