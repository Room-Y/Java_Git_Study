package catchExecption;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 18:08
 */
public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};


        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());

//            System.out.println(e.toString());
            e.printStackTrace();
//            throw new RuntimeException(e);
        }

        System.out.println("看我执行了吗");
    }
}
