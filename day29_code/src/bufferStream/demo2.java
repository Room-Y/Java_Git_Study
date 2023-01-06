package bufferStream;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 20:15
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day29_code\\src\\bufferStream\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29_code\\src\\bufferStream\\c.txt", true));

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
