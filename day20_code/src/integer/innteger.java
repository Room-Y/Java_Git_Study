package integer;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 20:34
 */
public class innteger {
    public static void main(String[] args) {
        //JDK5以前的方式
//        Integer i1 = new Integer(1);
////        Integer i2 = new Integer("555");
//        Integer i3 = Integer.valueOf(3);
//        System.out.println(i1);
//        System.out.println(i2);

        Integer i4 = 5;
        Integer i5 = i4 + 5;

        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
    }
}
