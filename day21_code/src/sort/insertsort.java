package sort;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 14:17
 */
public class insertsort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
