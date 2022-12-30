package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 14:54
 */
public class array {
    public static void main(String[] args) {
        Integer[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                });

        Arrays.sort(arr, (o1, o2)-> o1-o2);
    }
}
