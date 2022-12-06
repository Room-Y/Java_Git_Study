import java.util.StringJoiner;

/**
 * @author: Java_cmr
 * @Date: 2022/12/6 - 11:50
 */
public class replaceStr {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(s.replace("aba", "t"));
        StringBuilder ss = new StringBuilder("aa");
        System.out.println(ss.append("a"));
        System.out.println(ss);

        StringJoiner sj = new StringJoiner("d");
        sj.add("ad");
        System.out.println(sj);

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity() + " " + sb1.length());
        sb1.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb1.capacity() + " " + sb1.length());
        sb1.append("0123456789");
        System.out.println(sb1.capacity() + " " + sb1.length());
    }
}
