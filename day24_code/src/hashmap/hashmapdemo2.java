package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 16:59
 */
public class hashmapdemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        for(int i = 0; i < 80; i++){
            String key = arr[r.nextInt(arr.length)];
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key)+1);
            }
            else{
                hm.put(key, 1);
            }
        }

        System.out.println(hm);
        int maxn = 0;
        String locate = "";
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() > maxn)
                maxn = entry.getValue();
        }
        System.out.println(maxn);

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() == maxn)
                System.out.println("最多人想去的地方是： "  + entry.getKey());
        }
    }
}
