package File;

import java.io.File;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 23:01
 */
public class allforeachFile {
    public static void main(String[] args) {
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));
    }
}
