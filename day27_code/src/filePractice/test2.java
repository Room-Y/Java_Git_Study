package filePractice;

import java.io.File;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 23:21
 */
public class test2 {
    public static void main(String[] args) {
        String str = "day27_code\\src\\filePractice\\aaa";
        File f1 = new File(str);
        System.out.println(f1.isDirectory());

        File[] files = f1.listFiles();
        Arrays.stream(files).forEach(file -> System.out.println(file));

        System.out.println();

        Arrays.stream(files).filter(file -> file.isFile() && file.getName().endsWith(".avi")).forEach(file -> System.out.println(file));

    }
}
