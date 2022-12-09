package internalClass1;

/**
 * @author: Java_cmr
 * @Date: 2022/12/9 - 11:49
 */
public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
    }
}
