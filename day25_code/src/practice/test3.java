package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 2:59
 */
public class test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random r= new Random();
        for(int i = 0; i < 11; i++){
            if(list.size() == 0){
                Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
            }
            String tmp = list.get(r.nextInt(list.size()));
            System.out.println(tmp);
            list.remove(tmp);
        }

    }
}
