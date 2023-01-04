package filePractice;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Java_cmr
 * @Date: 2023/1/5 - 0:10
 */
public class test6 {
    public static void main(String[] args) {
        String str = "day27_code\\src\\filePractice\\aaa";
        File src = new File(str);
        System.out.println(getSum(src));
    }

    public static HashMap<String, Integer> getSum(File src){
        HashMap<String, Integer> mp = new HashMap<>();
        File[] files = src.listFiles();
        for(File file : files){
            if(file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length-1];
                    if(mp.containsKey(endName))
                        mp.put(endName, mp.get(endName)+1);
                    else
                        mp.put(endName, 1);
                }
            }
            else{
                HashMap<String, Integer> sonMap = getSum(file);
                for(Map.Entry<String, Integer> entry : sonMap.entrySet()){
                    String endName = entry.getKey();
                    if(mp.containsKey(endName))
                        mp.put(endName, mp.get(endName) + entry.getValue());
                    else
                        mp.put(endName, entry.getValue());
                }

            }
        }
        return mp;
    }
}
