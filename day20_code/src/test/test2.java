package test;

/**
 * @author: Java_cmr
 * @Date: 2022/12/29 - 21:23
 */
public class test2 {
    public static void main(String[] args) {
        String str = "1234568291";

        String regex = "[1-9]\\d{0,9}";

        if(!str.matches(regex)){
            System.out.println("格式有误");
        }else{
            System.out.println("格式正确");
            int number = 0;
            for(int i = 0; i < str.length(); i++){
                number = number*10 + str.charAt(i) - '0';
            }
            System.out.println(number);
        }


    }
}
