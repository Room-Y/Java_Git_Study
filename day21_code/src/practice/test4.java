package practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 16:20
 */
public class test4 {
    public static void main(String[] args) {
        int f1 = 1, f2 = 2;
        for(int i = 3; i <= 20; i++){
            int f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.println(i + ": " + f1 + " " + f2);
        }
    }
}
