package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author: Java_cmr
 * @Date: 2023/1/3 - 0:20
 */
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(boys, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girls, "杜琦燕","袁明媛", "李猜", "田蜜蜜");
        Collections.addAll(list, 1,1,1,1,1,1,1,0,0,0);

        Random r = new Random();
        int index = r.nextInt(list.size());
        if(list.get(index) == 1){
            System.out.println(boys.get(r.nextInt(boys.size())));
        }
        else{
            System.out.println(girls.get(r.nextInt(girls.size())));
        }
    }
}
