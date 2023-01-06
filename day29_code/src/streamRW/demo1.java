package streamRW;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 20:48
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day29_code\\src\\streamRW\\a.txt"), "GBK");

        int ch;
        while((ch = isr.read()) != -1){
            System.out.println((char)ch);
        }

        isr.close();

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29_code\\src\\streamRW\\a.txt"), "UTF-8");
        osw.write("好好学习天天向上\n哈哈哈哈");
        osw.close();

        FileWriter fw = new FileWriter("day29_code\\src\\streamRW\\c.txt", Charset.forName("utf8"));
        fw.write("滴滴答答\n哈哈哈哈");
        fw.close();
    }
}
