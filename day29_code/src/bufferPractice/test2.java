package bufferPractice;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 20:37
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("day29_code\\src\\bufferPractice\\count.txt"));

        String line = bf.readLine();
        int count = Integer.parseInt(line);

        count++;

        if(count <= 3){
            System.out.println("欢迎使用本软件，第" + count + "次使用免费");
        }else{
            System.out.println("本软件只能免费试用三次，请注册会员后使用");
        }

        bf.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("day29_code\\src\\bufferPractice\\count.txt"));
        bw.write(String.valueOf(count));
        bw.close();


    }
}
