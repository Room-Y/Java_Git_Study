package filePractice;

import java.io.File;

/**
 * @author: Java_cmr
 * @Date: 2023/1/5 - 0:03
 */
public class test5 {
    public static void main(String[] args) {
        String str = "day27_code\\src\\filePractice\\aaa";
        File src = new File(str);
        System.out.println(getSum(src));
    }

    public static long getSum(File src){
        long len = 0;
        File[] files = src.listFiles();
        for(File file : files){
            if(file.isFile())
                len += file.length();
            else
                len += getSum(file);
        }
        return len;
    }
}
