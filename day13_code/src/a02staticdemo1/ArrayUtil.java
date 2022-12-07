package a02staticdemo1;

/**
 * @author: Java_cmr
 * @Date: 2022/12/7 - 15:37
 */
public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum / arr.length;
    }
}
