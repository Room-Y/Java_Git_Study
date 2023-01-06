package streamRW;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 21:03
 */
public class demo2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day29_code\\src\\streamRW\\a.txt")));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

    }
}
