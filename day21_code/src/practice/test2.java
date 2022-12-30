package practice;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 16:13
 */
public class test2 {
    public static void main(String[] args) {
        int fb1 = 1, fb2 = 1;
        for(int i = 3; i <= 12; i++){
            int fb = fb1 + fb2;
            fb1 = fb2;
            fb2 = fb;
        }

        System.out.println(fb1 + " " + fb2);
    }
}
