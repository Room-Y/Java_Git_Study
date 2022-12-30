package sort;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 14:26
 */
public class quicksort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    public static void quickSort(int[] arr, int l, int r){
        if(l >= r)
            return;
        int pivot = l;
        int begin = l, end = r;
        l++;
        while(l < r){
            while(l < r && arr[r] > arr[pivot]){
                r--;
            }

            while(l < r && arr[l] <  arr[pivot]){
                l++;
            }

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        int temp = arr[pivot];
        arr[pivot] = arr[l];
        arr[l] = temp;
        quickSort(arr, begin, l-1);
        quickSort(arr, l+1, end);
    }
}
