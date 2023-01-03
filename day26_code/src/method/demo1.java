package method;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 3:39
 */
public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {3,5,8,5,4};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, demo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
}
