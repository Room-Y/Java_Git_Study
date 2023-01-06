package bufferStream;

import java.io.*;
import java.nio.Buffer;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 18:40
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29_code\\src\\bufferStream\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29_code\\src\\bufferStream\\b.txt"));

//        int b;
//        while((b = bis.read()) != -1)
//            bos.write(b);

        byte[] bytes = new byte[300];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }
}
