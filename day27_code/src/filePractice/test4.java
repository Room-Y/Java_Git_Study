package filePractice;

import java.io.File;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 23:49
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        createDupDic();

        String dupDoc = "day27_code\\src\\filePractice\\dupDic";
        File src = new File(dupDoc);
        delete(src);
    }

    public static void delete(File src){
        File[] files = src.listFiles();
        for(File file : files){
            if(file.isFile())
                file.delete();
            else
                delete(file);
        }
        src.delete();
    }


    public static void createDupDic() throws IOException {
        String dupDoc = "day27_code\\src\\filePractice\\dupDic";
        String aaa = "aaa";
        String bbb = "bbb";
        File file1 = new File(dupDoc, aaa);
        File file2 = new File(dupDoc, bbb);

        System.out.println(file1.mkdirs());
        System.out.println(file2.mkdirs());

        File a = new File(file1, "aaa.txt");
        File b = new File(file1, "bbb.txt");
        File c = new File(file2, "ccc.txt");
        File d = new File(file2, "ddd.txt");

        a.createNewFile();
        b.createNewFile();
        c.createNewFile();
        d.createNewFile();
    }
}
