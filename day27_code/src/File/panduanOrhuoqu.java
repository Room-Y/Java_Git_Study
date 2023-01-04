package File;

import java.io.File;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:37
 */
public class panduanOrhuoqu {
    public static void main(String[] args) {
        String str = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File\\1.txt";
        File f1 = new File(str);

        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println(f1.getName());
        System.out.println(f1.lastModified());


        System.out.println("-----------------------");

//        str = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File\\aa";
//        f1 = new File(str);
//        System.out.println(f1.length());
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());
//
//        System.out.println("-----------------------");
//
//        str = "D:\\Java\\StudyLessonOne\\day27_code\\src\\File\\c";
//        f1 = new File(str);
//        System.out.println(f1.isDirectory());
//        System.out.println(f1.isFile());
//        System.out.println(f1.exists());

        System.out.println(f1.length());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());

        System.out.println("-----------------------");

        str = "b";
        f1 = new File(str);
        System.out.println(f1.length());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.lastModified());
    }
}
