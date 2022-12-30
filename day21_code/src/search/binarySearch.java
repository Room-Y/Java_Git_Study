package search;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 0:38
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 79));
        System.out.println(binarySearch(arr, 0));
    }

    public static int binarySearch(int[] arr, int number){
        int min = 0;
        int max = arr.length - 1;

        while(min <= max){
            int mid = (max + min) / 2;
            if(arr[mid] > number){
                max = mid-1;
            }
            else if(arr[mid] < number){
                min = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
