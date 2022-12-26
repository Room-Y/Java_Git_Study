package mathAPI;

/**
 * @author: Java_cmr
 * @Date: 2022/12/24 - 3:29
 */
public class mathAPI {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(-2147483648));  //整型最小值不会返回对应的正数
        System.out.println(Math.abs(-2147483647));

        System.out.println("----------------------------");
        System.out.println(Math.ceil(12.5));
        System.out.println(Math.ceil(-12.5));

        System.out.println("----------------------------");
        System.out.println(Math.floor(12.5));
        System.out.println(Math.floor(-12.5));

        System.out.println("----------------------------");
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.5));
        System.out.println(Math.round(-12.51));
        System.out.println(Math.round(-12.4));
        System.out.println(Math.round(-12.49));
        System.out.println(Math.round(-12.6));

        System.out.println("----------------------------");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));
    }
}
