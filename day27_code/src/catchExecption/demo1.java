package catchExecption;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 17:44
 */
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        try{
            System.out.println(arr[10]);
            System.out.println(arr[1]/0);
        } catch (ArrayIndexOutOfBoundsException  e){
            System.out.println("索引越界了");
        } catch (ArithmeticException | NullPointerException e){

            System.out.println("运算问题");
        }

        System.out.println("看看我执行了吗");
    }
}
