package System;

/**
 * @author: Java_cmr
 * @Date: 2022/12/24 - 3:48
 */
public class SystemAPI {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];

//        System.arraycopy(arr1, 0, arr2, 0, 10);

        System.arraycopy(arr1, 0, arr2, 4, 3);
        for(int i = 0; i < arr2.length; i++)
            System.out.printf(arr2[i]+" ");

        System.exit(0);
        System.out.println("enheng?!");
    }
}
