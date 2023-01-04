package filePractice;

import java.io.File;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 23:38
 */
public class test3 {
    public static void main(String[] args) {
        String str = "D:";
        File src = new File(str);
        findAVI(src);
    }

    public static void findAVI(File src){
        File[] files = src.listFiles();
        if(files == null){
//            System.out.println(src);
            return;
        }
        for(File file : files){
            if(file.isFile()){
                if(file.getName().endsWith(".avi"))
                    System.out.println(file);
            }
            else{
                findAVI(file);
            }
        }
    }


}
