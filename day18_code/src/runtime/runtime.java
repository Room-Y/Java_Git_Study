package runtime;

import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2022/12/26 - 18:33
 */
public class runtime {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime());

        System.out.println();
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println();

        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        Runtime.getRuntime().exec("notepad");
    }
}
