package printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * @author: Java_cmr
 * @Date: 2023/1/7 - 0:20
 */
public class demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fs = new PrintStream(new FileOutputStream("day29_code\\src\\printStream\\a.txt"), true, Charset.forName("utf8"));
        fs.println(97);
        fs.println(99);
        fs.println(true);
        fs.close();
    }
}
