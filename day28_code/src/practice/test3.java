package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 17:21
 */
public class test3 {
    public static void main(String[] args) throws IOException {
        //文件数组排序
        FileReader fr = new FileReader("day28_code\\src\\practice\\sort.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch = fr.read()) != -1)
            sb.append((char)ch);
        fr.close();
        System.out.println(sb);

        sb.toString().split("-");

        Integer[] integers = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));

        String replace = Arrays.toString(integers).replace(", ", "-");
        System.out.println(replace);

        String substring = replace.substring(1, replace.length() - 1);
        System.out.println(substring);

        FileWriter fw = new FileWriter("day28_code\\src\\practice\\sorted.txt");
        fw.write(substring);
        fw.close();


    }
}
