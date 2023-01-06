package encodeOrdecode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 3:38
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28_code\\src\\encodeOrdecode\\b.txt", true);
        fw.write("我");
        fw.write("爱");
        fw.write("\n");

        fw.write("哈哈哈哈哈哈\n");
        fw.close();
    }
}
