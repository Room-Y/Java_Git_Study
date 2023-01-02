package treemap;

import java.util.TreeMap;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 18:06
 */
public class demo2 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(tm.containsKey(c)){
                tm.put(c, tm.get(c) + 1);
            }
            else{
                tm.put(c, 1);
            }
        }

        System.out.println(tm);
    }
}
