package args;

/**
 * @author: Java_cmr
 * @Date: 2023/1/2 - 21:28
 */
public class argdemo {
    public static void main(String[] args) {
        System.out.println(getSum(1,5,6));
    }

    public static int getSum(int... x){
        int ans = 0;
        for(int i : x){
            ans += i;
        }
        return ans;
    }
}
