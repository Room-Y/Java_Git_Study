package practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 16:24
 */
public class test5 {
    public static void main(String[] args) {
        int fb1 = 1, fb2 = 2, fb3 = 4;
        for(int i = 4; i <= 20; i++){
            int fb = fb1 + fb2 + fb3;
            fb1 = fb2;
            fb2 = fb3;
            fb3 = fb;
            System.out.println(i + ": " + fb1 + " " + fb2 + " " + fb3);
        }
    }
}
