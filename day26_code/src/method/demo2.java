package method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 3:46
 */
public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(s -> System.out.println(s));

        list.stream().map(Integer::parseInt).forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream().filter(new demo2()::strJudge).forEach(s -> System.out.print(s + " "));


    }

    public boolean strJudge(String s){
        return s.startsWith("1") && s.length() == 1;
    }
}
