package generics;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:28
 */
public class test {
    public static void main(String[] args) {
        genericDemo<String> list = new genericDemo<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);
    }
}
