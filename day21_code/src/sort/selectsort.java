package sort;

/**
 * @author: Java_cmr
 * @Date: 2022/12/30 - 14:13
 */
public class selectsort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1, 1};

        for(int i = 0; i < arr.length; i++){
            int idx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[idx] > arr[j]){
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
