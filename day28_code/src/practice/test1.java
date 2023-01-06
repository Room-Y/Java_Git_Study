package practice;

import java.io.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/6 - 14:59
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        //复制文件夹包括子目录
        String srcstr = "D:\\Java\\StudyLessonOne\\day28_code\\src\\practice\\aaa";
        String deststr = "D:\\Java\\StudyLessonOne\\day28_code\\src\\practice\\dest";
        File src = new File(srcstr);
        File dest = new File(deststr);
        copyDir(src, dest);
    }

    public static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for(File file : files){
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read()) != -1){
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }
            else{
                copyDir(file, new File(dest, file.getName()));
            }
        }
    }
}
