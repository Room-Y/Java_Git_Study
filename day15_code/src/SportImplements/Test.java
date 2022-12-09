package SportImplements;

/**
 * @author: Java_cmr
 * @Date: 2022/12/8 - 20:43
 */
public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("刘诗雯", 26);
        System.out.println(pps.toString());
        pps.study();
        pps.speakEnglish();
    }
}
