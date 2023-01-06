package encodeOrdecode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 3:31
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28_code\\src\\encodeOrdecode\\a.txt");
        int ch;

        while((ch = fr.read()) != -1)
            System.out.println((char)ch);

        fr.close();

    }
}
