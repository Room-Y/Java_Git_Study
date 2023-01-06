package encodeOrdecode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 14:54
 */
public class demo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28_code\\src\\encodeOrdecode\\c.txt");
        fw.write(97);
        fw.write(98);
        fw.write(99);
        fw.write(100);
//        fw.close();

        for(int i = 0; i < 8188; i++)
            fw.write(97);

        fw.write(100);
        fw.flush();
//        fw.close();
    }
}
