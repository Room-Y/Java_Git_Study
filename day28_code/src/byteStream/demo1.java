package byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author: Java_cmr
 * @Date: 2023/1/5 - 4:20
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fops = new FileOutputStream("day28_code\\src\\byteStream\\a.txt");
        fops.write(98);
        fops.write(57);
        fops.write(55);
        fops.close();

        FileOutputStream fos = new FileOutputStream("day28_code\\src\\byteStream\\b.txt");
        fos.write(96);

        byte[] bytes = {97,98,99,100,101};
        fos.write(bytes);
        fos.write(bytes,1,2);
        fos.close();

        FileOutputStream fos1 = new FileOutputStream("day28_code\\src\\byteStream\\c.txt");
        String str = "dafafdewgrdsf";
        fos1.write(str.getBytes());
        String str1 = "\n111111";
        fos1.write(str1.getBytes());

        fos1.close();

        FileOutputStream fos2 = new FileOutputStream("day28_code\\src\\byteStream\\d.txt", true);
        fos2.write("aaa\n".getBytes());
        fos2.close();
    }
}
