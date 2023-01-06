package bufferPractice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 20:24
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("day29_code\\src\\bufferPractice\\csb.txt"));

        String line;
        ArrayList<String> list = new ArrayList<>();

        while((line = bf.readLine()) != null){
            list.add(line);
            System.out.println(line);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });

        System.out.println(list);

        BufferedWriter bw = new BufferedWriter(new FileWriter("day29_code\\src\\bufferPractice\\csbSorted.txt"));
        for (String s : list){
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        bf.close();
    }
}
