/**
 * @author: Java_cmr
 * @Date: ${DATE} - ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 5;
        switch (a){
            case 1 -> System.out.println(111);
            case 2 -> System.out.println(222);
            case 3 -> System.out.println(333);
            case 4 -> System.out.println(444);
            default -> System.out.println("default");
        }
    }
}