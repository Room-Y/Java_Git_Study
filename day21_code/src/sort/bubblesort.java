package sort;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 14:08
 */
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1, 1};

        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length-1; j > i; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
