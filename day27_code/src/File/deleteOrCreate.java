package File;

import java.io.File;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:50
 */
public class deleteOrCreate {
    public static void main(String[] args) throws IOException {
        File f1 = new File("day27_code\\src\\File\\create1.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("day27_code\\src\\File\\dir1");
        System.out.println(f2.mkdir());

        File f3 = new File("day27_code\\src\\File\\dir2\\dir3");
        System.out.println(f3.mkdirs());

        File f4 = new File("day27_code\\src\\File\\dir2\\dir3\\ggg.txt");
        System.out.println(f4.createNewFile());

        File f5 = new File("day27_code\\src\\File\\dir2\\kkk.txt");
        System.out.println(f5.createNewFile());

        System.out.println(f1.delete());
    }
}
