package search;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 22:25
 */
public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        System.out.println(basicSearch(arr, 81));
        System.out.println(basicSearch(arr, 78));
    }

    public static boolean basicSearch(int[] arr, int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val)
                return true;
        }

        return false;
    }
}
