package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/5 - 23:30
 */
public class demo2Input {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("day28_code\\src\\byteStream\\d.txt");
        int a ;
        while((a = fi.read()) != -1){
//            System.out.println((char)a);
            System.out.println(a);

        }
    }
}
