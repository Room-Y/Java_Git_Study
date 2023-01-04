package File;

import java.io.File;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:26
 */
public class demo1 {
    public static void main(String[] args) {
        String str = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File\\1.txt";
        File f1 = new File(str);
//        System.out.println(f1);

        String parent = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File";
        String child = "1.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File parent2 = new File(parent);
        File f3 = new File(parent2, child);
        System.out.println(f3);
    }
}
