package practice;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 17:11
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        //文件的加密与解密
        File file = new File("day28_code\\src\\practice\\encode\\mn.jpg");
//
//        FileInputStream fis = new FileInputStream("day28_code\\src\\practice\\encode\\mn.jpg");
//        FileOutputStream fos = new FileOutputStream("day28_code\\src\\practice\\encode\\ency.jpg");

        FileInputStream fis = new FileInputStream("day28_code\\src\\practice\\encode\\ency.jpg");
        FileOutputStream fos = new FileOutputStream("day28_code\\src\\practice\\encode\\decode.jpg");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b ^ 152);
        }

        fos.close();
        fis.close();
    }
}
