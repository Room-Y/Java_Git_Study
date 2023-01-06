package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/5 - 23:49
 */
public class demo3Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("day28_code\\src\\byteStream\\copySrc.mp4");
        FileOutputStream fops = new FileOutputStream("day28_code\\src\\byteStream\\copyDet.mp4");

        int b;
        while((b = fi.read()) != -1){
            fops.write(b);
        }
        fops.close();
        fi.close();
    }
}
