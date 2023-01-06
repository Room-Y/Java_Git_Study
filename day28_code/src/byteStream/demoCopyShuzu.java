package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Timer;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 2:49
 */
public class demoCopyShuzu {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("day28_code\\src\\byteStream\\copySrc.mp4");
        FileOutputStream fops = new FileOutputStream("day28_code\\src\\byteStream\\copyDetShuzu.mp4");

        long start = System.currentTimeMillis();

        int b;
        byte[] bytes = new byte[5 * 1024 * 1024];
        while((b = fi.read(bytes)) != -1){
            fops.write(bytes, 0, b);
        }
        fops.close();
        fi.close();

        System.out.println(System.currentTimeMillis() - start);
    }
}
