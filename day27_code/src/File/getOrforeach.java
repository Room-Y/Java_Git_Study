package File;

import java.io.File;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 21:56
 */
public class getOrforeach {
    public static void main(String[] args) {
        String str = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File";
        File f = new File(str);

        File[] files = f.listFiles();
        for(File file : files)
            System.out.println(file);

    }
}
