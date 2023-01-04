package filePractice;

import java.io.File;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 23:19
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        String str = "day27_code\\src\\filePractice\\aaa";
        File f1 = new File(str, "a.txt");
        f1.createNewFile();
    }
}
