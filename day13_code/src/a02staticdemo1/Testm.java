package a02staticdemo1;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 15:42
 */
public class Testm {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(ArrayUtil.printArr(arr1));

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(ArrayUtil.getAverage(arr2));
    }
}
