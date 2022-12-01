import java.util.Random;

/**
 * @author: Java_cmr
 * @Date: ${DATE} - ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random r = new Random();
        int a = r.nextInt(0,10);
        System.out.println(a);
    }
}