package collection;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 23:40
 */
public class enhenceFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("----------------------------");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "  hhhhh");
            }
        });

        System.out.println("----------------------------");

        list.forEach(s -> {
            System.out.println(s + "  aaaaa");
        });


    }
}
