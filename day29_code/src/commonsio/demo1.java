package commonsio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * @author: Java_cmr
 * @Date: 2023/1/7 - 2:40
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("day29_code\\src\\commonsio\\a.txt");
        File dest = new File("day29_code\\src\\commonsio\\aCopy.txt");
        FileUtils.copyFile(src, dest);
    }
}
